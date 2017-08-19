package org.icannt.netherendingores.common.block.blocks;

import java.util.Map;

import org.icannt.netherendingores.common.block.BlockVariantBase;
import org.icannt.netherendingores.common.block.variant.EnumOreVanillaType;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by ICannt on 17/08/17.
 */
public class BlockOreEndVanilla extends BlockVariantBase {

    private static final PropertyEnum<EnumOreVanillaType> VARIANT = PropertyEnum.create("ore", EnumOreVanillaType.class);

    public BlockOreEndVanilla() {
        super(Material.ROCK, MapColor.GRAY, "ore_end_vanilla");
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, VARIANT);
    }   
    
	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)
	{
		for (EnumOreVanillaType type : EnumOreVanillaType.values()) {
			list.add(new ItemStack(this, 1, type.ordinal()));
		}
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(VARIANT, EnumOreVanillaType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(VARIANT).ordinal();
    }
    
    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }

    @Override
    public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
        return state.getValue(VARIANT).getLight();
    }

    @Override
    public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
        return state.getValue(VARIANT).getHardness();
    }

    @Override
    public float getExplosionResistance(World world, BlockPos pos, Entity exploder, Explosion explosion) {
        return world.getBlockState(pos).getValue(VARIANT).getResistance() / 5F;
    }
    
    @Override
    public int getHarvestLevel(IBlockState state) {
        return state.getValue(VARIANT).getHarvestLevel();
    }

    @SideOnly(Side.CLIENT)
    public void initClient() {
        ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(this), stack -> {
            int meta = stack.getMetadata();

            EnumOreVanillaType ore = EnumOreVanillaType.values()[meta];
            BlockRendererDispatcher dispatcher = Minecraft.getMinecraft().getBlockRendererDispatcher();
            Map<IBlockState, ModelResourceLocation> variants = dispatcher.getBlockModelShapes().getBlockStateMapper().getVariants(BlockOreEndVanilla.this);
            return variants.get(BlockOreEndVanilla.this.getDefaultState().withProperty(VARIANT, ore));
        });
    }
}
