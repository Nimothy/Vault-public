package iskallia.vault.item.gear.model;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class Plated2ArmorModel<T extends LivingEntity> extends VaultGearModel<T> {

    public Plated2ArmorModel(float modelSize, EquipmentSlotType slotType) {
        super(modelSize, slotType);
        textureWidth = 64;
        textureHeight = isLayer2() ? 32 : 64;

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        Head.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -4.25F, 8.0F, 8.0F, 8.0F, 1.0F, false);
        Head.setTextureOffset(20, 16).addBox(-6.0F, -4.0F, -5.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);
        Head.setTextureOffset(20, 16).addBox(5.0F, -4.0F, -5.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);
        Head.setTextureOffset(32, 5).addBox(-6.0F, -1.0F, -6.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(32, 5).addBox(3.0F, -1.0F, -6.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        ModelRenderer cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-2.5F, 0.5F, -5.5F);
        Head.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.3927F, 0.0F);
        cube_r1.setTextureOffset(55, 6).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        ModelRenderer cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(2.5F, 0.5F, -5.5F);
        Head.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
        cube_r2.setTextureOffset(55, 6).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        ModelRenderer cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(5.35F, -9.25F, 3.0F);
        Head.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.6109F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(0, 0).addBox(-0.5F, -2.75F, -1.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
        cube_r3.setTextureOffset(0, 0).addBox(-11.25F, -2.75F, -1.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);

        ModelRenderer cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(3.6F, -8.75F, -1.0F);
        Head.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.6109F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(0, 0).addBox(-0.5F, -2.25F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
        cube_r4.setTextureOffset(0, 0).addBox(-7.5F, -2.25F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

        ModelRenderer cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.1F, -8.75F, -2.75F);
        Head.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.6545F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(0, 0).addBox(-0.5F, -2.25F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.setTextureOffset(0, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, true);
        Body.setTextureOffset(0, 50).addBox(-6.0F, -2.0F, -4.0F, 12.0F, 6.0F, 8.0F, 0.0F, false);
        Body.setTextureOffset(26, 32).addBox(-5.5F, 4.0F, -4.0F, 11.0F, 3.0F, 8.0F, 0.0F, false);
        Body.setTextureOffset(30, 22).addBox(-5.25F, 7.0F, -3.5F, 10.0F, 3.0F, 7.0F, 0.0F, false);
        Body.setTextureOffset(40, 49).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 3.0F, 2.0F, 0.0F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        RightArm.setTextureOffset(0, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
        RightArm.setTextureOffset(36, 0).addBox(-5.0F, -4.25F, -3.5F, 7.0F, 5.0F, 7.0F, 0.0F, true);
        RightArm.setTextureOffset(40, 11).addBox(-5.0F, 2.0F, -3.5F, 5.0F, 2.0F, 7.0F, 0.0F, true);

        ModelRenderer cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-4.0F, -5.0F, 0.0F);
        RightArm.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 0.4363F);
        cube_r6.setTextureOffset(0, 37).addBox(0.0F, -1.0F, -3.0F, 4.0F, 2.0F, 6.0F, 0.0F, true);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        LeftArm.setTextureOffset(0, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
        LeftArm.setTextureOffset(40, 11).addBox(-0.25F, 2.0F, -3.5F, 5.0F, 2.0F, 7.0F, 0.0F, false);
        LeftArm.setTextureOffset(36, 0).addBox(-2.0F, -4.25F, -3.5F, 7.0F, 5.0F, 7.0F, 0.0F, true);

        ModelRenderer cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(2.125F, -4.0F, 0.0F);
        LeftArm.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3927F);
        cube_r7.setTextureOffset(0, 36).addBox(-2.125F, -1.0F, -3.0F, 4.0F, 2.0F, 6.0F, 0.0F, true);

        RightBoot = new ModelRenderer(this);
        RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
        RightBoot.setTextureOffset(0, 48).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 1.0F, false);

        LeftBoot = new ModelRenderer(this);
        LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
        LeftBoot.setTextureOffset(0, 48).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 1.0F, true);

        Belt = new ModelRenderer(this);
        Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
        Belt.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
    }

}
