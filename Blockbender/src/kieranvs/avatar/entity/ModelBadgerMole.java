package kieranvs.avatar.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBadgerMole extends ModelBase{
  
    ModelRenderer head;
    ModelRenderer snout_p_1;
    ModelRenderer nose;
    ModelRenderer body;
    ModelRenderer leg_r;
    ModelRenderer leg_l;
    ModelRenderer horn1;
    ModelRenderer horn2;
    ModelRenderer belly;
    ModelRenderer neck;
    ModelRenderer neck2;
    ModelRenderer body2;
    ModelRenderer belly2;
    ModelRenderer jaw;
    ModelRenderer mouth;
    ModelRenderer body3;
    ModelRenderer belly3;
    ModelRenderer body4;
    ModelRenderer tail_1;
    ModelRenderer tail_2;
    ModelRenderer tail_3;
    ModelRenderer tail_4;
    ModelRenderer leg_l2;
    ModelRenderer leg_r2;
    ModelRenderer back_foot_r;
    ModelRenderer back_foot_l;
    ModelRenderer arm_R_1;
    ModelRenderer arm_R_2;
    ModelRenderer hand_r;
    ModelRenderer toe_r_5;
    ModelRenderer toe_r_4;
    ModelRenderer toe_r_3;
    ModelRenderer toe_r_2;
    ModelRenderer toe_r_1;
    ModelRenderer arm_L_1;
    ModelRenderer arm_L_2;
    ModelRenderer hand_l;
    ModelRenderer toe_l_5;
    ModelRenderer toe_l_4;
    ModelRenderer toe_l_3;
    ModelRenderer toe_l_2;
    ModelRenderer toe_l_1;
  
  public ModelBadgerMole(){
    textureWidth = 256;
    textureHeight = 128;
    
      head = new ModelRenderer(this, 216, 0);
      head.addBox(-6F, -5F, -14F, 12, 11, 8);
      head.setRotationPoint(0F, -2F, -14F);
      head.setTextureSize(256, 128);
      head.mirror = true;
      setRotation(head, 0.4461433F, 0F, 0F);
      snout_p_1 = new ModelRenderer(this, 221, 20);
      snout_p_1.addBox(-5F, -10.53333F, -19F, 10, 5, 8);
      snout_p_1.setRotationPoint(0F, -2F, -14F);
      snout_p_1.setTextureSize(256, 128);
      snout_p_1.mirror = true;
      setRotation(snout_p_1, 0.8748334F, 0F, 0F);
      nose = new ModelRenderer(this, 190, 16);
      nose.addBox(-3.5F, -4.5F, -23.6F, 7, 4, 4);
      nose.setRotationPoint(0F, -3F, -13F);
      nose.setTextureSize(256, 128);
      nose.mirror = true;
      setRotation(nose, 0.6343084F, 0F, 0F);
      body = new ModelRenderer(this, 105, 29);
      body.addBox(-10F, -12F, -2F, 20, 13, 21);
      body.setRotationPoint(0F, 5F, 2F);
      body.setTextureSize(256, 128);
      body.mirror = true;
      setRotation(body, 1.831047F, 0F, 0F);
      leg_r = new ModelRenderer(this, 203, 102);
      leg_r.addBox(-5F, 0F, -1F, 6, 16, 10);
      leg_r.setRotationPoint(-7F, -1F, 24F);
      leg_r.setTextureSize(256, 128);
      leg_r.mirror = true;
      setRotation(leg_r, -0.3300634F, 0F, 0F);
      leg_r.mirror = false;
      leg_l = new ModelRenderer(this, 203, 102);
      leg_l.addBox(-1F, 0F, -1F, 6, 16, 10);
      leg_l.setRotationPoint(7F, -1F, 24F);
      leg_l.setTextureSize(256, 128);
      leg_l.mirror = true;
      setRotation(leg_l, -0.3300634F, 0F, 0F);
      horn1 = new ModelRenderer(this, 180, 16);
      horn1.addBox(-8F, 3F, -7F, 1, 5, 3);
      horn1.setRotationPoint(0F, -2F, -14F);
      horn1.setTextureSize(256, 128);
      horn1.mirror = true;
      setRotation(horn1, -0.7853982F, -0.2268928F, 0F);
      horn1.mirror = false;
      horn2 = new ModelRenderer(this, 180, 16);
      horn2.addBox(7F, 3F, -7F, 1, 5, 3);
      horn2.setRotationPoint(0F, -2F, -14F);
      horn2.setTextureSize(256, 128);
      horn2.mirror = true;
      setRotation(horn2, -0.7853982F, 0.2268928F, 0F);
      belly = new ModelRenderer(this, 40, 40);
      belly.addBox(-9F, -14F, -11F, 18, 15, 11);
      belly.setRotationPoint(0F, 5F, 2F);
      belly.setTextureSize(256, 128);
      belly.mirror = true;
      setRotation(belly, 1.164104F, 0F, 0F);
      neck = new ModelRenderer(this, 189, 37);
      neck.addBox(-8F, -18F, -0.5F, 16, 9, 17);
      neck.setRotationPoint(0F, 3F, 1F);
      neck.setTextureSize(256, 128);
      neck.mirror = true;
      setRotation(neck, 1.905404F, 0F, 0F);
      neck2 = new ModelRenderer(this, 130, 13);
      neck2.addBox(-5.5F, -20F, 2F, 11, 2, 13);
      neck2.setRotationPoint(0F, 3F, 1F);
      neck2.setTextureSize(256, 128);
      neck2.mirror = true;
      setRotation(neck2, 1.905404F, 0F, 0F);
      body2 = new ModelRenderer(this, 175, 65);
      body2.addBox(-10F, -3F, -3F, 18, 13, 22);
      body2.setRotationPoint(1F, 5F, 2F);
      body2.setTextureSize(256, 128);
      body2.mirror = true;
      setRotation(body2, 1.645154F, 0F, 0F);
      belly2 = new ModelRenderer(this, 40, 40);
      belly2.addBox(-8F, -7F, -11F, 16, 15, 11);
      belly2.setRotationPoint(0F, 5F, 2F);
      belly2.setTextureSize(256, 128);
      belly2.mirror = true;
      setRotation(belly2, 1.387175F, 0F, 0F);
      jaw = new ModelRenderer(this, 212, 24);
      jaw.addBox(-1F, -5.1F, -24.1F, 2, 2, 2);
      jaw.setRotationPoint(0F, -2F, -13F);
      jaw.setTextureSize(256, 128);
      jaw.mirror = true;
      setRotation(jaw, 0.6343084F, 0F, 0F);
      mouth = new ModelRenderer(this, 181, 1);
      mouth.addBox(-4F, 3.5F, -19.6F, 8, 6, 8);
      mouth.setRotationPoint(0F, -2F, -13F);
      mouth.setTextureSize(256, 128);
      mouth.mirror = true;
      setRotation(mouth, 0.1509865F, 0F, 0F);
      body3 = new ModelRenderer(this, 97, 65);
      body3.addBox(-8.5F, 2F, -3F, 15, 19, 23);
      body3.setRotationPoint(1F, 4F, 2F);
      body3.setTextureSize(256, 128);
      body3.mirror = true;
      setRotation(body3, 1.236189F, 0F, 0F);
      belly3 = new ModelRenderer(this, 50, 14);
      belly3.addBox(-7F, 4F, -13F, 14, 14, 8);
      belly3.setRotationPoint(0F, 5F, 2F);
      belly3.setTextureSize(256, 128);
      belly3.mirror = true;
      setRotation(belly3, 1.721783F, 0F, 0F);
      body4 = new ModelRenderer(this, 36, 73);
      body4.addBox(-7.5F, 24F, -7.266667F, 12, 9, 17);
      body4.setRotationPoint(1F, 2F, 1F);
      body4.setTextureSize(256, 128);
      body4.mirror = true;
      setRotation(body4, 1.422082F, 0F, 0F);
      tail_1 = new ModelRenderer(this, 0, 81);
      tail_1.addBox(-5F, -3F, -9F, 7, 7, 11);
      tail_1.setRotationPoint(1F, 5F, 35F);
      tail_1.setTextureSize(256, 128);
      tail_1.mirror = true;
      setRotation(tail_1, 1.284728F, 0F, 0F);
      tail_2 = new ModelRenderer(this, 30, 103);
      tail_2.addBox(-4F, 3F, -7F, 5, 16, 7);
      tail_2.setRotationPoint(1F, 4F, 35F);
      tail_2.setTextureSize(256, 128);
      tail_2.mirror = true;
      setRotation(tail_2, 1.061656F, 0F, 0F);
      tail_3 = new ModelRenderer(this, 4, 100);
      tail_3.addBox(-3.5F, 14F, -12F, 4, 21, 5);
      tail_3.setRotationPoint(1F, 4F, 35F);
      tail_3.setTextureSize(256, 128);
      tail_3.mirror = true;
      setRotation(tail_3, 1.396263F, 0F, 0F);
      tail_4 = new ModelRenderer(this, 4, 100);
      tail_4.addBox(-3F, 34F, -12F, 3, 15, 4);
      tail_4.setRotationPoint(1F, 4F, 35F);
      tail_4.setTextureSize(256, 128);
      tail_4.mirror = true;
      setRotation(tail_4, 1.396263F, 0F, 0F);
      leg_l2 = new ModelRenderer(this, 98, 3);
      leg_l2.addBox(-0.9F, 15F, -3F, 6, 9, 7);
      leg_l2.setRotationPoint(7F, -1F, 24F);
      leg_l2.setTextureSize(256, 128);
      leg_l2.mirror = true;
      setRotation(leg_l2, 0.0034907F, 0F, 0F);
      leg_r2 = new ModelRenderer(this, 98, 3);
      leg_r2.addBox(-5.1F, 15F, -3F, 6, 9, 7);
      leg_r2.setRotationPoint(-7F, -1F, 24F);
      leg_r2.setTextureSize(256, 128);
      leg_r2.mirror = true;
      setRotation(leg_r2, 0.0034907F, 0F, 0F);
      leg_r2.mirror = false;
      back_foot_r = new ModelRenderer(this, 57, 103);
      back_foot_r.addBox(-5.3F, 23F, -9F, 7, 2, 11);
      back_foot_r.setRotationPoint(-7F, -1F, 24F);
      back_foot_r.setTextureSize(256, 128);
      back_foot_r.mirror = true;
      setRotation(back_foot_r, 0F, 0.1047198F, 0F);
      back_foot_l = new ModelRenderer(this, 57, 103);
      back_foot_l.addBox(-1.7F, 23F, -9F, 7, 2, 11);
      back_foot_l.setRotationPoint(7F, -1F, 24F);
      back_foot_l.setTextureSize(256, 128);
      back_foot_l.mirror = true;
      setRotation(back_foot_l, 0F, -0.1047198F, 0F);
      arm_R_1 = new ModelRenderer(this, 1, 47);
      arm_R_1.addBox(-8F, -5F, -4F, 8, 15, 9);
      arm_R_1.setRotationPoint(-7F, 2F, -5F);
      arm_R_1.setTextureSize(256, 128);
      arm_R_1.mirror = true;
      setRotation(arm_R_1, 0.1570796F, 0F, 0.0872665F);
      arm_R_1.mirror = false;
      arm_R_2 = new ModelRenderer(this, 0, 21);
      arm_R_2.addBox(-9F, 5F, -4F, 8, 15, 9);
      arm_R_2.setRotationPoint(-7F, 2F, -5F);
      arm_R_2.setTextureSize(256, 128);
      arm_R_2.mirror = true;
      setRotation(arm_R_2, -0.1745329F, 0F, 0.0872665F);
      arm_R_2.mirror = false;
      hand_r = new ModelRenderer(this, 157, 111);
      hand_r.addBox(-12F, 18F, -13F, 10, 3, 12);
      hand_r.setRotationPoint(-7F, 2F, -5F);
      hand_r.setTextureSize(256, 128);
      hand_r.mirror = true;
      setRotation(hand_r, 0F, 0.0523599F, 0F);
      hand_r.mirror = false;
      toe_r_5 = new ModelRenderer(this, 100, 113);
      toe_r_5.addBox(-3.5F, 18.5F, -19F, 2, 2, 7);
      toe_r_5.setRotationPoint(-7F, 2F, -5F);
      toe_r_5.setTextureSize(256, 128);
      toe_r_5.mirror = true;
      setRotation(toe_r_5, 0F, 0.0523599F, 0F);
      toe_r_4 = new ModelRenderer(this, 120, 111);
      toe_r_4.addBox(-5.8F, 18.5F, -18F, 2, 2, 6);
      toe_r_4.setRotationPoint(-7F, 2F, -5F);
      toe_r_4.setTextureSize(256, 128);
      toe_r_4.mirror = true;
      setRotation(toe_r_4, 0F, 0.0523599F, 0F);
      toe_r_3 = new ModelRenderer(this, 137, 119);
      toe_r_3.addBox(-8.2F, 18.5F, -17F, 2, 2, 5);
      toe_r_3.setRotationPoint(-7F, 2F, -5F);
      toe_r_3.setTextureSize(256, 128);
      toe_r_3.mirror = true;
      setRotation(toe_r_3, 0F, 0.0523599F, 0F);
      toe_r_2 = new ModelRenderer(this, 124, 122);
      toe_r_2.addBox(-10.3F, 18.5F, -16F, 2, 2, 3);
      toe_r_2.setRotationPoint(-7F, 2F, -5F);
      toe_r_2.setTextureSize(256, 128);
      toe_r_2.mirror = true;
      setRotation(toe_r_2, 0F, 0.0523599F, 0F);
      toe_r_1 = new ModelRenderer(this, 124, 122);
      toe_r_1.addBox(-12.5F, 18.5F, -15F, 2, 2, 3);
      toe_r_1.setRotationPoint(-7F, 2F, -5F);
      toe_r_1.setTextureSize(256, 128);
      toe_r_1.mirror = true;
      setRotation(toe_r_1, 0F, 0.0523599F, 0F);
      arm_L_1 = new ModelRenderer(this, 1, 47);
      arm_L_1.addBox(1F, -5F, -4F, 8, 15, 9);
      arm_L_1.setRotationPoint(7F, 2F, -5F);
      arm_L_1.setTextureSize(256, 128);
      arm_L_1.mirror = true;
      setRotation(arm_L_1, 0.1570796F, 0F, -0.0872665F);
      arm_L_2 = new ModelRenderer(this, 0, 21);
      arm_L_2.addBox(2F, 5F, -4F, 8, 15, 9);
      arm_L_2.setRotationPoint(7F, 2F, -5F);
      arm_L_2.setTextureSize(256, 128);
      arm_L_2.mirror = true;
      setRotation(arm_L_2, -0.1745329F, 0F, -0.0872665F);
      hand_l = new ModelRenderer(this, 157, 111);
      hand_l.addBox(3F, 18F, -13F, 10, 3, 12);
      hand_l.setRotationPoint(7F, 2F, -5F);
      hand_l.setTextureSize(256, 128);
      hand_l.mirror = true;
      setRotation(hand_l, 0F, -0.0523599F, 0F);
      toe_l_5 = new ModelRenderer(this, 100, 113);
      toe_l_5.addBox(2.5F, 18.5F, -19F, 2, 2, 7);
      toe_l_5.setRotationPoint(7F, 2F, -5F);
      toe_l_5.setTextureSize(256, 128);
      toe_l_5.mirror = true;
      setRotation(toe_l_5, 0F, -0.0523599F, 0F);
      toe_l_4 = new ModelRenderer(this, 120, 111);
      toe_l_4.addBox(4.8F, 18.5F, -18F, 2, 2, 6);
      toe_l_4.setRotationPoint(7F, 2F, -5F);
      toe_l_4.setTextureSize(256, 128);
      toe_l_4.mirror = true;
      setRotation(toe_l_4, 0F, -0.0523599F, 0F);
      toe_l_3 = new ModelRenderer(this, 137, 119);
      toe_l_3.addBox(7.2F, 18.5F, -17F, 2, 2, 5);
      toe_l_3.setRotationPoint(7F, 2F, -5F);
      toe_l_3.setTextureSize(256, 128);
      toe_l_3.mirror = true;
      setRotation(toe_l_3, 0F, -0.0523599F, 0F);
      toe_l_2 = new ModelRenderer(this, 124, 122);
      toe_l_2.addBox(9.3F, 18.5F, -16F, 2, 2, 3);
      toe_l_2.setRotationPoint(7F, 2F, -5F);
      toe_l_2.setTextureSize(256, 128);
      toe_l_2.mirror = true;
      setRotation(toe_l_2, 0F, -0.0523599F, 0F);
      toe_l_1 = new ModelRenderer(this, 124, 122);
      toe_l_1.addBox(11.5F, 18.5F, -15F, 2, 2, 3);
      toe_l_1.setRotationPoint(7F, 2F, -5F);
      toe_l_1.setTextureSize(256, 128);
      toe_l_1.mirror = true;
      setRotation(toe_l_1, 0F, -0.0523599F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    snout_p_1.render(f5);
    nose.render(f5);
    body.render(f5);
    leg_r.render(f5);
    leg_l.render(f5);
    horn1.render(f5);
    horn2.render(f5);
    belly.render(f5);
    neck.render(f5);
    neck2.render(f5);
    body2.render(f5);
    belly2.render(f5);
    jaw.render(f5);
    mouth.render(f5);
    body3.render(f5);
    belly3.render(f5);
    body4.render(f5);
    tail_1.render(f5);
    tail_2.render(f5);
    tail_3.render(f5);
    tail_4.render(f5);
    leg_l2.render(f5);
    leg_r2.render(f5);
    back_foot_r.render(f5);
    back_foot_l.render(f5);
    arm_R_1.render(f5);
    arm_R_2.render(f5);
    hand_r.render(f5);
    toe_r_5.render(f5);
    toe_r_4.render(f5);
    toe_r_3.render(f5);
    toe_r_2.render(f5);
    toe_r_1.render(f5);
    arm_L_1.render(f5);
    arm_L_2.render(f5);
    hand_l.render(f5);
    toe_l_5.render(f5);
    toe_l_4.render(f5);
    toe_l_3.render(f5);
    toe_l_2.render(f5);
    toe_l_1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z){
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e){
    super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

  }

}