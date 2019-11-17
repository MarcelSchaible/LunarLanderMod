package com.lunarlander.lunarlandermod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.HandSide;
import net.minecraft.world.World;

public class LanderEntity extends LivingEntity {

  public LanderEntity(
      EntityType<? extends LanderEntity> type, World world) {
    super(type, world);
  }

  @Override
  public Iterable<ItemStack> getArmorInventoryList() {
    return null;
  }

  @Override
  public ItemStack getItemStackFromSlot(EquipmentSlotType slotIn) {
    return ItemStack.EMPTY;
  }

  @Override
  public void setItemStackToSlot(EquipmentSlotType slotIn, ItemStack stack) {

  }

  @Override
  public HandSide getPrimaryHand() {
    return HandSide.LEFT;
  }
}
