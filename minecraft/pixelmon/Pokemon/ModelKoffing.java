// Date: 8/4/2012 11:02:17 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelKoffing extends ModelBase
{
  //fields
    ModelRenderer Main_body;
 
    ModelRenderer blow_hole_11_part_1;
    ModelRenderer blow_hole_11_part_2;
    ModelRenderer  blow_hole_11_part_3;
    ModelRenderer blow_hole_11_part_4;
    ModelRenderer  blow_hole_10_part_1;
    ModelRenderer blow_hole_10_part_2;
    ModelRenderer blow_hole_10_part_3;
    ModelRenderer blow_hole_10_part_4;
    ModelRenderer blow_hole_9_part_4;
    ModelRenderer blow_hole_9_part_3;
    ModelRenderer blow_hole_9_part_2;
    ModelRenderer  blow_hole_9_part_1;
    ModelRenderer  blow_hole_8_part_4;
    ModelRenderer blow_hole_8_part_3;
    ModelRenderer blow_hole_8_part_2;
    ModelRenderer blow_hole_8_part_1;
    ModelRenderer blow_hole_7_part_4;
    ModelRenderer blow_hole_7_part_3;
    ModelRenderer blow_hole_7_part_2;
    ModelRenderer blow_hole_7_part_1;
    ModelRenderer top_blow_hole_6_part_4;
    ModelRenderer top_blow_hole_6_part_3;
    ModelRenderer top_blow_hole_6_part_2;
    ModelRenderer top_blow_hole_6_part_1;
    ModelRenderer top_blow_hole_5_part_4;
    ModelRenderer top_blow_hole_5_part_3;
    ModelRenderer top_blow_hole_5_part_2;
    ModelRenderer top_blow_hole_5_part_1;
    ModelRenderer top_blow_hole_4_part_4;
    ModelRenderer top_blow_hole_4_part_3;
    ModelRenderer  top_blow_hole_4_part_2;
    ModelRenderer top_blow_hole_4_part_1;
    ModelRenderer  top_blow_hole_3_part_4;
    ModelRenderer  top_blow_hole_3_part_3;
    ModelRenderer top_blow_hole_3_part_2;
    ModelRenderer  top_blow_hole_3_part_1;
    ModelRenderer  top_blow_hole_2_part_4;
    ModelRenderer  top_blow_hole_2_part_3;
    ModelRenderer  top_blow_hole_2_part_2;
    ModelRenderer  top_blow_hole_2_part_1;
    ModelRenderer  top_blow_hole_1_part_4;
    ModelRenderer  top_blow_hole_1_part_3;
    ModelRenderer  top_blow_hole_1_part_2;
    ModelRenderer  top_blow_hole_1_part_1;
    ModelRenderer  main_middle;
    ModelRenderer  middle_side;
    ModelRenderer  vertical_side;
    ModelRenderer  horizontal_side;
  public ModelKoffing()
  {
    textureWidth = 256;
    textureHeight = 128;

    
    Main_body = new ModelRenderer(this, "Main_body");
    Main_body.setRotationPoint(0F, -4F, 0F);
    setRotation(Main_body, 0F, 0F, 0F);
    Main_body.mirror = true;
      blow_hole_11_part_1 = new ModelRenderer(this, 0, 0);
      blow_hole_11_part_1.addBox(0F, 0F, 18F, 1, 1, 1);
      blow_hole_11_part_1.setRotationPoint(1F, 7F, 1F);
      blow_hole_11_part_1.setTextureSize(256, 128);
      blow_hole_11_part_1.mirror = true;
      setRotation(blow_hole_11_part_1, 0F, 0F, 0F);
      blow_hole_11_part_2 = new ModelRenderer(this, 0, 0);
      blow_hole_11_part_2.addBox(0F, -2F, 18F, 1, 1, 1);
      blow_hole_11_part_2.setRotationPoint(1F, 7F, 1F);
      blow_hole_11_part_2.setTextureSize(256, 128);
      blow_hole_11_part_2.mirror = true;
      setRotation(blow_hole_11_part_2, 0F, 0F, 0F);
      blow_hole_11_part_3 = new ModelRenderer(this, 0, 0);
      blow_hole_11_part_3.addBox(-1F, -2F, 18F, 1, 3, 1);
      blow_hole_11_part_3.setRotationPoint(1F, 7F, 1F);
      blow_hole_11_part_3.setTextureSize(256, 128);
      blow_hole_11_part_3.mirror = true;
      setRotation(blow_hole_11_part_3, 0F, 0F, 0F);
      blow_hole_11_part_4 = new ModelRenderer(this, 0, 0);
      blow_hole_11_part_4.addBox(1F, -2F, 18F, 1, 3, 1);
      blow_hole_11_part_4.setRotationPoint(1F, 7F, 1F);
      blow_hole_11_part_4.setTextureSize(256, 128);
      blow_hole_11_part_4.mirror = true;
      setRotation(blow_hole_11_part_4, 0F, 0F, 0F);
      blow_hole_10_part_1 = new ModelRenderer(this, 0, 0);
      blow_hole_10_part_1.addBox(18F, 0F, 10F, 1, 1, 1);
      blow_hole_10_part_1.setRotationPoint(1F, 7F, 1F);
      blow_hole_10_part_1.setTextureSize(256, 128);
      blow_hole_10_part_1.mirror = true;
      setRotation(blow_hole_10_part_1, 0F, 0F, 0F);
      blow_hole_10_part_2 = new ModelRenderer(this, 0, 0);
      blow_hole_10_part_2.addBox(18F, -2F, 10F, 1, 1, 1);
      blow_hole_10_part_2.setRotationPoint(1F, 7F, 1F);
      blow_hole_10_part_2.setTextureSize(256, 128);
      blow_hole_10_part_2.mirror = true;
      setRotation(blow_hole_10_part_2, 0F, 0F, 0F);
      blow_hole_10_part_3 = new ModelRenderer(this, 0, 0);
      blow_hole_10_part_3.addBox(18F, -2F, 9F, 1, 3, 1);
      blow_hole_10_part_3.setRotationPoint(1F, 7F, 1F);
      blow_hole_10_part_3.setTextureSize(256, 128);
      blow_hole_10_part_3.mirror = true;
      setRotation(blow_hole_10_part_3, 0F, 0F, 0F);
      blow_hole_10_part_4 = new ModelRenderer(this, 0, 0);
      blow_hole_10_part_4.addBox(18F, -2F, 11F, 1, 3, 1);
      blow_hole_10_part_4.setRotationPoint(1F, 7F, 1F);
      blow_hole_10_part_4.setTextureSize(256, 128);
      blow_hole_10_part_4.mirror = true;
      setRotation(blow_hole_10_part_4, 0F, 0F, 0F);
      blow_hole_9_part_1 = new ModelRenderer(this, 0, 0);
      blow_hole_9_part_1.addBox(18F, 6F, 0F, 1, 1, 1);
      blow_hole_9_part_1.setRotationPoint(1F, 7F, 1F);
      blow_hole_9_part_1.setTextureSize(256, 128);
      blow_hole_9_part_1.mirror = true;
      setRotation(blow_hole_9_part_1, 0F, 0F, 0F);
      blow_hole_9_part_2 = new ModelRenderer(this, 0, 0);
      blow_hole_9_part_2.addBox(18F, 4F, 0F, 1, 1, 1);
      blow_hole_9_part_2.setRotationPoint(1F, 7F, 1F);
      blow_hole_9_part_2.setTextureSize(256, 128);
      blow_hole_9_part_2.mirror = true;
      setRotation(blow_hole_9_part_2, 0F, 0F, 0F);
      blow_hole_9_part_3 = new ModelRenderer(this, 0, 0);
      blow_hole_9_part_3.addBox(18F, 4F, -1F, 1, 3, 1);
      blow_hole_9_part_3.setRotationPoint(1F, 7F, 1F);
      blow_hole_9_part_3.setTextureSize(256, 128);
      blow_hole_9_part_3.mirror = true;
      setRotation(blow_hole_9_part_3, 0F, 0F, 0F);
      blow_hole_9_part_4 = new ModelRenderer(this, 0, 0);
      blow_hole_9_part_4.addBox(18F, 4F, 1F, 1, 3, 1);
      blow_hole_9_part_4.setRotationPoint(1F, 7F, 1F);
      blow_hole_9_part_4.setTextureSize(256, 128);
      blow_hole_9_part_4.mirror = true;
      setRotation(blow_hole_9_part_4, 0F, 0F, 0F);
      blow_hole_8_part_1 = new ModelRenderer(this, 0, 0);
      blow_hole_8_part_1.addBox(-9F, 10F, 6F, 1, 1, 1);
      blow_hole_8_part_1.setRotationPoint(1F, 7F, 1F);
      blow_hole_8_part_1.setTextureSize(256, 128);
      blow_hole_8_part_1.mirror = true;
      setRotation(blow_hole_8_part_1, 0F, 0F, 0F);
      blow_hole_8_part_2 = new ModelRenderer(this, 0, 0);
      blow_hole_8_part_2.addBox(-9F, 8F, 6F, 1, 1, 1);
      blow_hole_8_part_2.setRotationPoint(1F, 7F, 1F);
      blow_hole_8_part_2.setTextureSize(256, 128);
      blow_hole_8_part_2.mirror = true;
      setRotation(blow_hole_8_part_2, 0F, 0F, 0F);
      blow_hole_8_part_3 = new ModelRenderer(this, 0, 0);
      blow_hole_8_part_3.addBox(-9F, 8F, 5F, 1, 3, 1);
      blow_hole_8_part_3.setRotationPoint(1F, 7F, 1F);
      blow_hole_8_part_3.setTextureSize(256, 128);
      blow_hole_8_part_3.mirror = true;
      setRotation(blow_hole_8_part_3, 0F, 0F, 0F);
      blow_hole_8_part_4 = new ModelRenderer(this, 0, 0);
      blow_hole_8_part_4.addBox(-9F, 8F, 7F, 1, 3, 1);
      blow_hole_8_part_4.setRotationPoint(1F, 7F, 1F);
      blow_hole_8_part_4.setTextureSize(256, 128);
      blow_hole_8_part_4.mirror = true;
      setRotation(blow_hole_8_part_4, 0F, 0F, 0F);
      blow_hole_7_part_1 = new ModelRenderer(this, 0, 0);
      blow_hole_7_part_1.addBox(-9F, 0F, 0F, 1, 1, 1);
      blow_hole_7_part_1.setRotationPoint(1F, 7F, 1F);
      blow_hole_7_part_1.setTextureSize(256, 128);
      blow_hole_7_part_1.mirror = true;
      setRotation(blow_hole_7_part_1, 0F, 0F, 0F);
      blow_hole_7_part_2 = new ModelRenderer(this, 0, 0);
      blow_hole_7_part_2.addBox(-9F, -2F, 0F, 1, 1, 1);
      blow_hole_7_part_2.setRotationPoint(1F, 7F, 1F);
      blow_hole_7_part_2.setTextureSize(256, 128);
      blow_hole_7_part_2.mirror = true;
      setRotation(blow_hole_7_part_2, 0F, 0F, 0F);
      blow_hole_7_part_3 = new ModelRenderer(this, 0, 0);
      blow_hole_7_part_3.addBox(-9F, -2F, -1F, 1, 3, 1);
      blow_hole_7_part_3.setRotationPoint(1F, 7F, 1F);
      blow_hole_7_part_3.setTextureSize(256, 128);
      blow_hole_7_part_3.mirror = true;
      setRotation(blow_hole_7_part_3, 0F, 0F, 0F);
      blow_hole_7_part_4 = new ModelRenderer(this, 0, 0);
      blow_hole_7_part_4.addBox(-9F, -2F, 1F, 1, 3, 1);
      blow_hole_7_part_4.setRotationPoint(1F, 7F, 1F);
      blow_hole_7_part_4.setTextureSize(256, 128);
      blow_hole_7_part_4.mirror = true;
      setRotation(blow_hole_7_part_4, 0F, 0F, 0F);
      top_blow_hole_6_part_1 = new ModelRenderer(this, 0, 0);
      top_blow_hole_6_part_1.addBox(4F, 18F, 10F, 3, 1, 1);
      top_blow_hole_6_part_1.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_6_part_1.setTextureSize(256, 128);
      top_blow_hole_6_part_1.mirror = true;
      setRotation(top_blow_hole_6_part_1, 0F, 0F, 0F);
      top_blow_hole_6_part_4 = new ModelRenderer(this, 0, 0);
      top_blow_hole_6_part_4.addBox(4F, 18F, 8F, 3, 1, 1);
      top_blow_hole_6_part_4.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_6_part_4.setTextureSize(256, 128);
      top_blow_hole_6_part_4.mirror = true;
      setRotation(top_blow_hole_6_part_4, 0F, 0F, 0F);
      top_blow_hole_6_part_3 = new ModelRenderer(this, 0, 0);
      top_blow_hole_6_part_3.addBox(4F, 18F, 9F, 1, 1, 1);
      top_blow_hole_6_part_3.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_6_part_3.setTextureSize(256, 128);
      top_blow_hole_6_part_3.mirror = true;
      setRotation(top_blow_hole_6_part_3, 0F, 0F, 0F);
      top_blow_hole_6_part_2 = new ModelRenderer(this, 0, 0);
      top_blow_hole_6_part_2.addBox(6F, 18F, 9F, 1, 1, 1);
      top_blow_hole_6_part_2.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_6_part_2.setTextureSize(256, 128);
      top_blow_hole_6_part_2.mirror = true;
      setRotation(top_blow_hole_6_part_2, 0F, 0F, 0F);
      top_blow_hole_5_part_1 = new ModelRenderer(this, 0, 0);
      top_blow_hole_5_part_1.addBox(9F, 18F, 4F, 3, 1, 1);
      top_blow_hole_5_part_1.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_5_part_1.setTextureSize(256, 128);
      top_blow_hole_5_part_1.mirror = true;
      setRotation(top_blow_hole_5_part_1, 0F, 0F, 0F);
      top_blow_hole_5_part_4 = new ModelRenderer(this, 0, 0);
      top_blow_hole_5_part_4.addBox(9F, 18F, 2F, 3, 1, 1);
      top_blow_hole_5_part_4.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_5_part_4.setTextureSize(256, 128);
      top_blow_hole_5_part_4.mirror = true;
      setRotation(top_blow_hole_5_part_4, 0F, 0F, 0F);
      top_blow_hole_5_part_3 = new ModelRenderer(this, 0, 0);
      top_blow_hole_5_part_3.addBox(11F, 18F, 3F, 1, 1, 1);
      top_blow_hole_5_part_3.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_5_part_3.setTextureSize(256, 128);
      top_blow_hole_5_part_3.mirror = true;
      setRotation(top_blow_hole_5_part_3, 0F, 0F, 0F);
      top_blow_hole_5_part_2 = new ModelRenderer(this, 0, 0);
      top_blow_hole_5_part_2.addBox(9F, 18F, 3F, 1, 1, 1);
      top_blow_hole_5_part_2.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_5_part_2.setTextureSize(256, 128);
      top_blow_hole_5_part_2.mirror = true;
      setRotation(top_blow_hole_5_part_2, 0F, 0F, 0F);
      top_blow_hole_4_part_1 = new ModelRenderer(this, 0, 0);
      top_blow_hole_4_part_1.addBox(-2F, 18F, 0F, 3, 1, 1);
      top_blow_hole_4_part_1.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_4_part_1.setTextureSize(256, 128);
      top_blow_hole_4_part_1.mirror = true;
      setRotation(top_blow_hole_4_part_1, 0F, 0F, 0F);
      top_blow_hole_4_part_3 = new ModelRenderer(this, 0, 0);
      top_blow_hole_4_part_3.addBox(0F, 18F, -1F, 1, 1, 1);
      top_blow_hole_4_part_3.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_4_part_3.setTextureSize(256, 128);
      top_blow_hole_4_part_3.mirror = true;
      setRotation(top_blow_hole_4_part_3, 0F, 0F, 0F);
      top_blow_hole_4_part_2 = new ModelRenderer(this, 0, 0);
      top_blow_hole_4_part_2.addBox(-2F, 18F, -1F, 1, 1, 1);
      top_blow_hole_4_part_2.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_4_part_2.setTextureSize(256, 128);
      top_blow_hole_4_part_2.mirror = true;
      setRotation(top_blow_hole_4_part_2, 0F, 0F, 0F);
      top_blow_hole_4_part_4 = new ModelRenderer(this, 0, 0);
      top_blow_hole_4_part_4.addBox(0F, 18F, 0F, 3, 1, 1);
      top_blow_hole_4_part_4.setRotationPoint(0F, 0F, 0F);
      top_blow_hole_4_part_4.setTextureSize(256, 128);
      top_blow_hole_4_part_4.mirror = true;
      setRotation(top_blow_hole_4_part_4, 0F, 0F, 0F);
      top_blow_hole_3_part_1 = new ModelRenderer(this, 0, 0);
      top_blow_hole_3_part_1.addBox(9F, -9F, 4F, 3, 1, 1);
      top_blow_hole_3_part_1.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_3_part_1.setTextureSize(256, 128);
      top_blow_hole_3_part_1.mirror = true;
      setRotation(top_blow_hole_3_part_1, 0F, 0F, 0F);
      top_blow_hole_3_part_4 = new ModelRenderer(this, 0, 0);
      top_blow_hole_3_part_4.addBox(9F, -9F, 2F, 3, 1, 1);
      top_blow_hole_3_part_4.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_3_part_4.setTextureSize(256, 128);
      top_blow_hole_3_part_4.mirror = true;
      setRotation(top_blow_hole_3_part_4, 0F, 0F, 0F);
      top_blow_hole_3_part_3 = new ModelRenderer(this, 0, 0);
      top_blow_hole_3_part_3.addBox(11F, -9F, 3F, 1, 1, 1);
      top_blow_hole_3_part_3.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_3_part_3.setTextureSize(256, 128);
      top_blow_hole_3_part_3.mirror = true;
      setRotation(top_blow_hole_3_part_3, 0F, 0F, 0F);
      top_blow_hole_3_part_2 = new ModelRenderer(this, 0, 0);
      top_blow_hole_3_part_2.addBox(9F, -9F, 3F, 1, 1, 1);
      top_blow_hole_3_part_2.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_3_part_2.setTextureSize(256, 128);
      top_blow_hole_3_part_2.mirror = true;
      setRotation(top_blow_hole_3_part_2, 0F, 0F, 0F);
      top_blow_hole_2_part_1 = new ModelRenderer(this, 0, 0);
      top_blow_hole_2_part_1.addBox(4F, -9F, 10F, 3, 1, 1);
      top_blow_hole_2_part_1.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_2_part_1.setTextureSize(256, 128);
      top_blow_hole_2_part_1.mirror = true;
      setRotation(top_blow_hole_2_part_1, 0F, 0F, 0F);
      top_blow_hole_2_part_4 = new ModelRenderer(this, 0, 0);
      top_blow_hole_2_part_4.addBox(4F, -9F, 8F, 3, 1, 1);
      top_blow_hole_2_part_4.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_2_part_4.setTextureSize(256, 128);
      top_blow_hole_2_part_4.mirror = true;
      setRotation(top_blow_hole_2_part_4, 0F, 0F, 0F);
      top_blow_hole_2_part_3 = new ModelRenderer(this, 0, 0);
      top_blow_hole_2_part_3.addBox(4F, -9F, 9F, 1, 1, 1);
      top_blow_hole_2_part_3.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_2_part_3.setTextureSize(256, 128);
      top_blow_hole_2_part_3.mirror = true;
      setRotation(top_blow_hole_2_part_3, 0F, 0F, 0F);
      top_blow_hole_2_part_2 = new ModelRenderer(this, 0, 0);
      top_blow_hole_2_part_2.addBox(6F, -9F, 9F, 1, 1, 1);
      top_blow_hole_2_part_2.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_2_part_2.setTextureSize(256, 128);
      top_blow_hole_2_part_2.mirror = true;
      setRotation(top_blow_hole_2_part_2, 0F, 0F, 0F);
      top_blow_hole_1_part_1 = new ModelRenderer(this, 0, 0);
      top_blow_hole_1_part_1.addBox(-2F, -9F, 0F, 3, 1, 1);
      top_blow_hole_1_part_1.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_1_part_1.setTextureSize(256, 128);
      top_blow_hole_1_part_1.mirror = true;
      setRotation(top_blow_hole_1_part_1, 0F, 0F, 0F);
      top_blow_hole_1_part_4 = new ModelRenderer(this, 0, 0);
      top_blow_hole_1_part_4.addBox(-2F, -9F, -2F, 3, 1, 1);
      top_blow_hole_1_part_4.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_1_part_4.setTextureSize(256, 128);
      top_blow_hole_1_part_4.mirror = true;
      setRotation(top_blow_hole_1_part_4, 0F, 0F, 0F);
      top_blow_hole_1_part_3 = new ModelRenderer(this, 0, 0);
      top_blow_hole_1_part_3.addBox(0F, -9F, -1F, 1, 1, 1);
      top_blow_hole_1_part_3.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_1_part_3.setTextureSize(256, 128);
      top_blow_hole_1_part_3.mirror = true;
      setRotation(top_blow_hole_1_part_3, 0F, 0F, 0F);
      top_blow_hole_1_part_2 = new ModelRenderer(this, 0, 0);
      top_blow_hole_1_part_2.addBox(-2F, -9F, -1F, 1, 1, 1);
      top_blow_hole_1_part_2.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_1_part_2.setTextureSize(256, 128);
      top_blow_hole_1_part_2.mirror = true;
      setRotation(top_blow_hole_1_part_2, 0F, 0F, 0F);
      main_middle = new ModelRenderer(this, 96, 32);
      main_middle.addBox(-7F, -7F, -7F, 24, 24, 24);
      main_middle.setRotationPoint(1F, 7F, 1F);
      main_middle.setTextureSize(256, 128);
      main_middle.mirror = true;
      setRotation(main_middle, 0F, 0F, 0F);
      middle_side = new ModelRenderer(this, 0, 80);
      middle_side.addBox(-6F, -6F, -8F, 22, 22, 26);
      middle_side.setRotationPoint(1F, 7F, 1F);
      middle_side.setTextureSize(256, 128);
      middle_side.mirror = true;
      setRotation(middle_side, 0F, 0F, 0F);
      vertical_side = new ModelRenderer(this, 96, 80);
      vertical_side.addBox(-6F, -8F, -6F, 22, 26, 22);
      vertical_side.setRotationPoint(1F, 7F, 1F);
      vertical_side.setTextureSize(256, 128);
      vertical_side.mirror = true;
      setRotation(vertical_side, 0F, 0F, 0F);
      horizontal_side = new ModelRenderer(this, 0, 36);
      horizontal_side.addBox(-8F, -6F, -6F, 26, 22, 22);
      horizontal_side.setRotationPoint(1F, 7F, 1F);
      horizontal_side.setTextureSize(256, 128);
      horizontal_side.mirror = true;
      setRotation(horizontal_side, 0F, 0F, 0F);
      
      Main_body.addChild(blow_hole_11_part_1);
      Main_body.addChild(blow_hole_11_part_2);
      Main_body.addChild(blow_hole_11_part_3);
      Main_body.addChild (blow_hole_11_part_4);
      Main_body.addChild(blow_hole_10_part_1);
      Main_body.addChild(blow_hole_10_part_2);
      Main_body.addChild(blow_hole_10_part_3);
      Main_body.addChild (blow_hole_10_part_4);
      Main_body.addChild (blow_hole_9_part_4);
      Main_body.addChild (blow_hole_9_part_3);
      Main_body.addChild (blow_hole_9_part_2);
      Main_body.addChild (blow_hole_9_part_1);
      Main_body.addChild (blow_hole_8_part_4);
      Main_body.addChild (blow_hole_8_part_3);
      Main_body.addChild (blow_hole_8_part_2);
      Main_body.addChild (blow_hole_8_part_1);
      Main_body.addChild (blow_hole_7_part_4);
      Main_body.addChild (blow_hole_7_part_3);
      Main_body.addChild(blow_hole_7_part_2);
      Main_body.addChild(blow_hole_7_part_1);
      Main_body.addChild(top_blow_hole_6_part_4);
      Main_body.addChild(top_blow_hole_6_part_3);
      Main_body.addChild(top_blow_hole_6_part_2);
      Main_body.addChild (top_blow_hole_6_part_1);
      Main_body.addChild  (top_blow_hole_5_part_4);
      Main_body.addChild (top_blow_hole_5_part_3);
      Main_body.addChild (top_blow_hole_5_part_2);
      Main_body.addChild  (top_blow_hole_5_part_1);
      Main_body.addChild  (top_blow_hole_4_part_4);
      Main_body.addChild  (top_blow_hole_4_part_3);
      Main_body.addChild (top_blow_hole_4_part_2);
      Main_body.addChild (top_blow_hole_4_part_1);
      Main_body.addChild(top_blow_hole_3_part_4);
      Main_body.addChild(top_blow_hole_3_part_3);
      Main_body.addChild(top_blow_hole_3_part_2);
      Main_body.addChild(top_blow_hole_3_part_1);
      Main_body.addChild(top_blow_hole_2_part_4);
      Main_body.addChild(top_blow_hole_2_part_3);
      Main_body.addChild(top_blow_hole_2_part_2);
      Main_body.addChild(top_blow_hole_2_part_1);
      Main_body.addChild(top_blow_hole_1_part_4);
      Main_body.addChild(top_blow_hole_1_part_3);
      Main_body.addChild(top_blow_hole_1_part_2);
      Main_body.addChild(top_blow_hole_1_part_1);
      Main_body.addChild(middle_side);
      Main_body.addChild(vertical_side);
      Main_body.addChild(horizontal_side);
      Main_body.addChild(main_middle);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Main_body.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
    Main_body.rotationPointY = MathHelper.cos(.1F*f2) * 15F - 50F;
  }

}
