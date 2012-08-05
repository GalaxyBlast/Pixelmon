// Date: 8/4/2012 11:25:48 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;


public class ModelWeezing extends ModelBase
{
  //fields
    ModelRenderer Main_body;
    ModelRenderer Weezing_pipe;
    ModelRenderer Weezing_second_head_pipe;
    ModelRenderer BB_middle;
    ModelRenderer BB_Vertical_side;
    ModelRenderer BB_horizontal_side;
    ModelRenderer BB_middle_side;
    ModelRenderer SBH1_pt_1;
    ModelRenderer SBH1_pt_2;
    ModelRenderer SBH1_pt_3;
    ModelRenderer SBH1_pt_4;
    ModelRenderer SBH2_pt_1;
    ModelRenderer SBH2_pt_2;
    ModelRenderer SBH2_pt_3;
    ModelRenderer SBH2_pt_4;
    ModelRenderer SBH3_pt_1;
    ModelRenderer SBH3_pt_2;
    ModelRenderer SBH3_pt_3;
    ModelRenderer SBH3_pt_4;
    ModelRenderer SBH4_pt_1;
    ModelRenderer SBH4_pt_2;
    ModelRenderer SBH4_pt_3;
    ModelRenderer SBH4_pt_4;
    ModelRenderer main_middle;
    ModelRenderer middle_Side;
    ModelRenderer vertical_side;
    ModelRenderer horizontal_side;
    ModelRenderer top_blow_hole_1_part_1;
    ModelRenderer top_blow_hole_1_part_2;
    ModelRenderer top_blow_hole_1_part_3;
    ModelRenderer top_blow_hole_1_part_4;
    ModelRenderer top_blow_hole_2_part_1;
    ModelRenderer top_blow_hole_2_part_2;
    ModelRenderer top_blow_hole_2_part_3;
    ModelRenderer top_blow_hole_2_part_4;
    ModelRenderer top_blow_hole_3_part_1;
    ModelRenderer top_blow_hole_3_part_2;
    ModelRenderer top_blow_hole_3_part_3;
    ModelRenderer top_blow_hole_3_part_4;
    ModelRenderer top_blow_hole_4_part_1;
    ModelRenderer top_blow_hole_4_part_2;
    ModelRenderer top_blow_hole_4_part_3;
    ModelRenderer top_blow_hole_4_part_4;
    ModelRenderer top_blow_hole_5_part_1;
    ModelRenderer top_blow_hole_5_part_2;
    ModelRenderer top_blow_hole_5_part_3;
    ModelRenderer top_blow_hole_5_part_4;
    ModelRenderer top_blow_hole_6_part_1;
    ModelRenderer top_blow_hole_6_part_2;
    ModelRenderer top_blow_hole_6_part_3;
    ModelRenderer top_blow_hole_6_part_4;
    ModelRenderer blow_hole_7_part_1;
    ModelRenderer blow_hole_7_part_2;
    ModelRenderer blow_hole_7_part_3;
    ModelRenderer blow_hole_7_part_4;
    ModelRenderer blow_hole_8_part_1;
    ModelRenderer blow_hole_8_part_2;
    ModelRenderer blow_hole_8_part_3;
    ModelRenderer blow_hole_8_part_4;
    ModelRenderer blow_hole_9_part_1;
    ModelRenderer blow_hole_9_part_2;
    ModelRenderer blow_hole_9_part_3;
    ModelRenderer blow_hole_9_part_4;
    ModelRenderer blow_hole_10_part_1;
    ModelRenderer blow_hole_10_part_2;
    ModelRenderer blow_hole_10_part_3;
    ModelRenderer blow_hole_10_part_4;
    ModelRenderer blow_hole_11_part_1;
    ModelRenderer blow_hole_11_part_2;
    ModelRenderer blow_hole_11_part_3;
    ModelRenderer blow_hole_11_part_4;
    ModelRenderer Secondary_middle;
    ModelRenderer Secondary_Horizontal_side;
    ModelRenderer Secondary_Virtical_side;
    ModelRenderer Secondary_Middle_side;
  
  public ModelWeezing()
  {
    textureWidth = 256;
    textureHeight = 128;
    setTextureOffset("Main_body.Pipes", 0, 0);
    setTextureOffset("Main_body.back_ball", 0, 0);
    setTextureOffset("Main_body.Secondary_Blow_Holes", 0, 0);
    setTextureOffset("Main_body.Second_Head", 0, 0);
    setTextureOffset("Main_body.blow_hole_11", 0, 0);
    setTextureOffset("Main_body.blow_hole_10", 0, 0);
    setTextureOffset("Main_body.blow_hole_9", 0, 0);
    setTextureOffset("Main_body.blow_hole_8", 0, 0);
    setTextureOffset("Main_body.blow_hole_7", 0, 0);
    setTextureOffset("Main_body.blow_hole_6", 0, 0);
    setTextureOffset("Main_body.blow_hole_5", 0, 0);
    setTextureOffset("Main_body.blow_hole_4", 0, 0);
    setTextureOffset("Main_body.blow_hole_3", 0, 0);
    setTextureOffset("Main_body.blow_hole_2", 0, 0);
    setTextureOffset("Main_body.blow_hole_1", 0, 0);
    setTextureOffset("Main_body.body", 0, 0);
    
    Main_body = new ModelRenderer(this, "Main_body");
    Main_body.setRotationPoint(0F, -4F, 0F);
    setRotation(Main_body, 0F, 0F, 0F);
    Main_body.mirror = true;
      Weezing_pipe = new ModelRenderer(this, 0, 64);
      Weezing_pipe.addBox(0F, 0F, 24F, 2, 2, 7);
      Weezing_pipe.setRotationPoint(0F, 0F, 0F);
      Weezing_pipe.setTextureSize(256, 128);
      Weezing_pipe.mirror = true;
      setRotation(Weezing_pipe, -0.2443461F, 0.715585F, 0F);
      Weezing_second_head_pipe = new ModelRenderer(this, 0, 59);
      Weezing_second_head_pipe.addBox(29F, 0F, 1F, 2, 2, 17);
      Weezing_second_head_pipe.setRotationPoint(0F, 0F, 0F);
      Weezing_second_head_pipe.setTextureSize(256, 128);
      Weezing_second_head_pipe.mirror = true;
      setRotation(Weezing_second_head_pipe, -0.4014257F, -0.3316126F, 0F);
      BB_middle = new ModelRenderer(this, 0, 66);
      BB_middle.addBox(20F, 6F, 21F, 5, 5, 5);
      BB_middle.setRotationPoint(0F, 0F, 0F);
      BB_middle.setTextureSize(256, 128);
      BB_middle.mirror = true;
      setRotation(BB_middle, 0F, 0F, 0F);
      BB_Vertical_side = new ModelRenderer(this, 0, 60);
      BB_Vertical_side.addBox(21F, 5F, 22F, 3, 7, 3);
      BB_Vertical_side.setRotationPoint(0F, 0F, 0F);
      BB_Vertical_side.setTextureSize(256, 128);
      BB_Vertical_side.mirror = true;
      setRotation(BB_Vertical_side, 0F, 0F, 0F);
      BB_horizontal_side = new ModelRenderer(this, 0, 60);
      BB_horizontal_side.addBox(19F, 7F, 22F, 7, 3, 3);
      BB_horizontal_side.setRotationPoint(0F, 0F, 0F);
      BB_horizontal_side.setTextureSize(256, 128);
      BB_horizontal_side.mirror = true;
      setRotation(BB_horizontal_side, 0F, 0F, 0F);
      BB_middle_side = new ModelRenderer(this, 0, 61);
      BB_middle_side.addBox(21F, 7F, 20F, 3, 3, 7);
      BB_middle_side.setRotationPoint(0F, 0F, 0F);
      BB_middle_side.setTextureSize(256, 128);
      BB_middle_side.mirror = true;
      setRotation(BB_middle_side, 0F, 0F, 0F);
      SBH1_pt_1 = new ModelRenderer(this, 0, 0);
      SBH1_pt_1.addBox(17F, 2F, -3F, 1, 1, 1);
      SBH1_pt_1.setRotationPoint(19.1F, 6F, 7.7F);
      SBH1_pt_1.setTextureSize(256, 128);
      SBH1_pt_1.mirror = true;
      setRotation(SBH1_pt_1, 0F, -0.1396263F, 0F);
      SBH1_pt_2 = new ModelRenderer(this, 0, 0);
      SBH1_pt_2.addBox(17F, 0F, -3F, 1, 1, 1);
      SBH1_pt_2.setRotationPoint(19.1F, 6F, 7.7F);
      SBH1_pt_2.setTextureSize(256, 128);
      SBH1_pt_2.mirror = true;
      setRotation(SBH1_pt_2, 0F, -0.1396263F, 0F);
      SBH1_pt_3 = new ModelRenderer(this, 0, 0);
      SBH1_pt_3.addBox(17F, 0F, -2F, 1, 3, 1);
      SBH1_pt_3.setRotationPoint(19.1F, 6F, 7.7F);
      SBH1_pt_3.setTextureSize(256, 128);
      SBH1_pt_3.mirror = true;
      setRotation(SBH1_pt_3, 0F, -0.1396263F, 0F);
      SBH1_pt_4 = new ModelRenderer(this, 0, 0);
      SBH1_pt_4.addBox(17F, 0F, -4F, 1, 3, 1);
      SBH1_pt_4.setRotationPoint(19.1F, 6F, 7.7F);
      SBH1_pt_4.setTextureSize(256, 128);
      SBH1_pt_4.mirror = true;
      setRotation(SBH1_pt_4, 0F, -0.1396263F, 0F);
      SBH2_pt_1 = new ModelRenderer(this, 0, 0);
      SBH2_pt_1.addBox(5F, -11F, -6F, 1, 1, 1);
      SBH2_pt_1.setRotationPoint(19F, 6F, 8F);
      SBH2_pt_1.setTextureSize(256, 128);
      SBH2_pt_1.mirror = true;
      setRotation(SBH2_pt_1, 0F, -0.1396263F, 0F);
      SBH2_pt_2 = new ModelRenderer(this, 0, 0);
      SBH2_pt_2.addBox(5F, -11F, -8F, 1, 1, 1);
      SBH2_pt_2.setRotationPoint(19F, 6F, 8F);
      SBH2_pt_2.setTextureSize(256, 128);
      SBH2_pt_2.mirror = true;
      setRotation(SBH2_pt_2, 0F, -0.1396263F, 0F);
      SBH2_pt_3 = new ModelRenderer(this, 0, 0);
      SBH2_pt_3.addBox(6F, -11F, -8F, 1, 1, 3);
      SBH2_pt_3.setRotationPoint(19F, 6F, 8F);
      SBH2_pt_3.setTextureSize(256, 128);
      SBH2_pt_3.mirror = true;
      setRotation(SBH2_pt_3, 0F, -0.1396263F, 0F);
      SBH2_pt_4 = new ModelRenderer(this, 0, 0);
      SBH2_pt_4.addBox(4F, -11F, -8F, 1, 1, 3);
      SBH2_pt_4.setRotationPoint(19F, 6F, 8F);
      SBH2_pt_4.setTextureSize(256, 128);
      SBH2_pt_4.mirror = true;
      setRotation(SBH2_pt_4, 0F, -0.1396263F, 0F);
      SBH3_pt_1 = new ModelRenderer(this, 0, 0);
      SBH3_pt_1.addBox(11F, -7F, 5F, 1, 1, 1);
      SBH3_pt_1.setRotationPoint(19F, 6F, 8F);
      SBH3_pt_1.setTextureSize(256, 128);
      SBH3_pt_1.mirror = true;
      setRotation(SBH3_pt_1, 0F, -0.1396263F, 0F);
      SBH3_pt_2 = new ModelRenderer(this, 0, 0);
      SBH3_pt_2.addBox(11F, -5F, 5F, 1, 1, 1);
      SBH3_pt_2.setRotationPoint(19F, 6F, 8F);
      SBH3_pt_2.setTextureSize(256, 128);
      SBH3_pt_2.mirror = true;
      setRotation(SBH3_pt_2, 0F, -0.1396263F, 0F);
      SBH3_pt_3 = new ModelRenderer(this, 0, 0);
      SBH3_pt_3.addBox(10F, -7F, 5F, 1, 3, 1);
      SBH3_pt_3.setRotationPoint(19F, 6F, 8F);
      SBH3_pt_3.setTextureSize(256, 128);
      SBH3_pt_3.mirror = true;
      setRotation(SBH3_pt_3, 0F, -0.1396263F, 0F);
      SBH3_pt_4 = new ModelRenderer(this, 0, 0);
      SBH3_pt_4.addBox(12F, -7F, 5F, 1, 3, 1);
      SBH3_pt_4.setRotationPoint(19F, 6F, 8F);
      SBH3_pt_4.setTextureSize(256, 128);
      SBH3_pt_4.mirror = true;
      setRotation(SBH3_pt_4, 0F, -0.1396263F, 0F);
      SBH4_pt_1 = new ModelRenderer(this, 0, 0);
      SBH4_pt_1.addBox(5F, 8F, -6F, 1, 1, 1);
      SBH4_pt_1.setRotationPoint(19F, 6F, 8F);
      SBH4_pt_1.setTextureSize(256, 128);
      SBH4_pt_1.mirror = true;
      setRotation(SBH4_pt_1, 0F, -0.1396263F, 0F);
      SBH4_pt_2 = new ModelRenderer(this, 0, 0);
      SBH4_pt_2.addBox(5F, 8F, -8F, 1, 1, 1);
      SBH4_pt_2.setRotationPoint(19F, 6F, 8F);
      SBH4_pt_2.setTextureSize(256, 128);
      SBH4_pt_2.mirror = true;
      setRotation(SBH4_pt_2, 0F, -0.1396263F, 0F);
      SBH4_pt_3 = new ModelRenderer(this, 0, 0);
      SBH4_pt_3.addBox(4F, 8F, -8F, 1, 1, 3);
      SBH4_pt_3.setRotationPoint(19F, 6F, 8F);
      SBH4_pt_3.setTextureSize(256, 128);
      SBH4_pt_3.mirror = true;
      setRotation(SBH4_pt_3, 0F, -0.1396263F, 0F);
      SBH4_pt_4 = new ModelRenderer(this, 0, 0);
      SBH4_pt_4.addBox(6F, 8F, -8F, 1, 1, 3);
      SBH4_pt_4.setRotationPoint(19F, 6F, 8F);
      SBH4_pt_4.setTextureSize(256, 128);
      SBH4_pt_4.mirror = true;
      setRotation(SBH4_pt_4, 0F, -0.1396263F, 0F);
      Secondary_middle = new ModelRenderer(this, 15, 53);
      Secondary_middle.addBox(0F, -9F, -12F, 16, 16, 16);
      Secondary_middle.setRotationPoint(19F, 6F, 8F);
      Secondary_middle.setTextureSize(256, 128);
      Secondary_middle.mirror = true;
      setRotation(Secondary_middle, 0F, -0.1396263F, 0F);
      Secondary_Horizontal_side = new ModelRenderer(this, 15, 53);
      Secondary_Horizontal_side.addBox(-1F, -8F, -11F, 18, 14, 14);
      Secondary_Horizontal_side.setRotationPoint(19F, 6F, 8F);
      Secondary_Horizontal_side.setTextureSize(256, 128);
      Secondary_Horizontal_side.mirror = true;
      setRotation(Secondary_Horizontal_side, 0F, -0.1396263F, 0F);
      Secondary_Virtical_side = new ModelRenderer(this, 20, 50);
      Secondary_Virtical_side.addBox(1F, -10F, -11F, 14, 18, 14);
      Secondary_Virtical_side.setRotationPoint(19F, 6F, 8F);
      Secondary_Virtical_side.setTextureSize(256, 128);
      Secondary_Virtical_side.mirror = true;
      setRotation(Secondary_Virtical_side, 0F, -0.1396263F, 0F);
      Secondary_Middle_side = new ModelRenderer(this, 16, 4);
      Secondary_Middle_side.addBox(1F, -8F, -13F, 14, 14, 18);
      Secondary_Middle_side.setRotationPoint(19F, 6F, 8F);
      Secondary_Middle_side.setTextureSize(256, 128);
      Secondary_Middle_side.mirror = true;
      setRotation(Secondary_Middle_side, 0F, -0.1396263F, 0F);
      blow_hole_11_part_1 = new ModelRenderer(this, 0, 0);
      blow_hole_11_part_1.addBox(8F, 5F, 18F, 1, 1, 1);
      blow_hole_11_part_1.setRotationPoint(1F, 7F, 1F);
      blow_hole_11_part_1.setTextureSize(256, 128);
      blow_hole_11_part_1.mirror = true;
      setRotation(blow_hole_11_part_1, 0F, 0F, 0F);
      blow_hole_11_part_2 = new ModelRenderer(this, 0, 0);
      blow_hole_11_part_2.addBox(8F, 3F, 18F, 1, 1, 1);
      blow_hole_11_part_2.setRotationPoint(1F, 7F, 1F);
      blow_hole_11_part_2.setTextureSize(256, 128);
      blow_hole_11_part_2.mirror = true;
      setRotation(blow_hole_11_part_2, 0F, 0F, 0F);
      blow_hole_11_part_3 = new ModelRenderer(this, 0, 0);
      blow_hole_11_part_3.addBox(7F, 3F, 18F, 1, 3, 1);
      blow_hole_11_part_3.setRotationPoint(1F, 7F, 1F);
      blow_hole_11_part_3.setTextureSize(256, 128);
      blow_hole_11_part_3.mirror = true;
      setRotation(blow_hole_11_part_3, 0F, 0F, 0F);
      blow_hole_11_part_3 = new ModelRenderer(this, 0, 0);
      blow_hole_11_part_3.addBox(9F, 3F, 18F, 1, 3, 1);
      blow_hole_11_part_3.setRotationPoint(1F, 7F, 1F);
      blow_hole_11_part_3.setTextureSize(256, 128);
      blow_hole_11_part_3.mirror = true;
      setRotation(blow_hole_11_part_3, 0F, 0F, 0F);
      blow_hole_10_part_1 = new ModelRenderer(this, 0, 0);
      blow_hole_10_part_1.addBox(18F, 6F, 10F, 1, 1, 1);
      blow_hole_10_part_1.setRotationPoint(1F, 7F, 1F);
      blow_hole_10_part_1.setTextureSize(256, 128);
      blow_hole_10_part_1.mirror = true;
      setRotation(blow_hole_10_part_1, 0F, 0F, 0F);
      blow_hole_10_part_2 = new ModelRenderer(this, 0, 0);
      blow_hole_10_part_2.addBox(18F, 4F, 10F, 1, 1, 1);
      blow_hole_10_part_2.setRotationPoint(1F, 7F, 1F);
      blow_hole_10_part_2.setTextureSize(256, 128);
      blow_hole_10_part_2.mirror = true;
      setRotation(blow_hole_10_part_2, 0F, 0F, 0F);
      blow_hole_10_part_3 = new ModelRenderer(this, 0, 0);
      blow_hole_10_part_3.addBox(18F, 4F, 9F, 1, 3, 1);
      blow_hole_10_part_3.setRotationPoint(1F, 7F, 1F);
      blow_hole_10_part_3.setTextureSize(256, 128);
      blow_hole_10_part_3.mirror = true;
      setRotation(blow_hole_10_part_3, 0F, 0F, 0F);
      blow_hole_10_part_4 = new ModelRenderer(this, 0, 0);
      blow_hole_10_part_4.addBox(18F, 4F, 11F, 1, 3, 1);
      blow_hole_10_part_4.setRotationPoint(1F, 7F, 1F);
      blow_hole_10_part_4.setTextureSize(256, 128);
      blow_hole_10_part_4.mirror = true;
      setRotation(blow_hole_10_part_4, 0F, 0F, 0F);
      blow_hole_9_part_1 = new ModelRenderer(this, 0, 0);
      blow_hole_9_part_1.addBox(18F, 3F, -1F, 1, 1, 1);
      blow_hole_9_part_1.setRotationPoint(1F, 7F, 1F);
      blow_hole_9_part_1.setTextureSize(256, 128);
      blow_hole_9_part_1.mirror = true;
      setRotation(blow_hole_9_part_1, 0F, 0F, 0F);
      blow_hole_9_part_2 = new ModelRenderer(this, 0, 0);
      blow_hole_9_part_2.addBox(18F, 1F, -1F, 1, 1, 1);
      blow_hole_9_part_2.setRotationPoint(1F, 7F, 1F);
      blow_hole_9_part_2.setTextureSize(256, 128);
      blow_hole_9_part_2.mirror = true;
      setRotation(blow_hole_9_part_2, 0F, 0F, 0F);
      blow_hole_9_part_3 = new ModelRenderer(this, 0, 0);
      blow_hole_9_part_3.addBox(18F, 1F, 0F, 1, 3, 1);
      blow_hole_9_part_3.setRotationPoint(1F, 7F, 1F);
      blow_hole_9_part_3.setTextureSize(256, 128);
      blow_hole_9_part_3.mirror = true;
      setRotation(blow_hole_9_part_3, 0F, 0F, 0F);
      blow_hole_9_part_4 = new ModelRenderer(this, 0, 0);
      blow_hole_9_part_4.addBox(18F, 1F, -2F, 1, 3, 1);
      blow_hole_9_part_4.setRotationPoint(1F, 7F, 1F);
      blow_hole_9_part_4.setTextureSize(256, 128);
      blow_hole_9_part_4.mirror = true;
      setRotation(blow_hole_9_part_4, 0F, 0F, 0F);
      blow_hole_8_part_1 = new ModelRenderer(this, 0, 0);
      blow_hole_8_part_1.addBox(-9F, 6F, 4F, 1, 1, 1);
      blow_hole_8_part_1.setRotationPoint(1F, 7F, 1F);
      blow_hole_8_part_1.setTextureSize(256, 128);
      blow_hole_8_part_1.mirror = true;
      setRotation(blow_hole_8_part_1, 0F, 0F, 0F);
      blow_hole_8_part_2 = new ModelRenderer(this, 0, 0);
      blow_hole_8_part_2.addBox(-9F, 4F, 4F, 1, 1, 1);
      blow_hole_8_part_2.setRotationPoint(1F, 7F, 1F);
      blow_hole_8_part_2.setTextureSize(256, 128);
      blow_hole_8_part_2.mirror = true;
      setRotation(blow_hole_8_part_2, 0F, 0F, 0F);
      blow_hole_8_part_3 = new ModelRenderer(this, 0, 0);
      blow_hole_8_part_3.addBox(-9F, 4F, 5F, 1, 3, 1);
      blow_hole_8_part_3.setRotationPoint(1F, 7F, 1F);
      blow_hole_8_part_3.setTextureSize(256, 128);
      blow_hole_8_part_3.mirror = true;
      setRotation(blow_hole_8_part_3, 0F, 0F, 0F);
      blow_hole_8_part_4 = new ModelRenderer(this, 0, 0);
      blow_hole_8_part_4.addBox(-9F, 4F, 3F, 1, 3, 1);
      blow_hole_8_part_4.setRotationPoint(1F, 7F, 1F);
      blow_hole_8_part_4.setTextureSize(256, 128);
      blow_hole_8_part_4.mirror = true;
      setRotation(blow_hole_8_part_4, 0F, 0F, 0F);
      blow_hole_7_part_1 = new ModelRenderer(this, 0, 0);
      blow_hole_7_part_1.addBox(-9F, -1F, 11F, 1, 1, 1);
      blow_hole_7_part_1.setRotationPoint(1F, 7F, 1F);
      blow_hole_7_part_1.setTextureSize(256, 128);
      blow_hole_7_part_1.mirror = true;
      setRotation(blow_hole_7_part_1, 0F, 0F, 0F);
      blow_hole_7_part_2 = new ModelRenderer(this, 0, 0);
      blow_hole_7_part_2.addBox(-9F, -3F, 11F, 1, 1, 1);
      blow_hole_7_part_2.setRotationPoint(1F, 7F, 1F);
      blow_hole_7_part_2.setTextureSize(256, 128);
      blow_hole_7_part_2.mirror = true;
      setRotation(blow_hole_7_part_2, 0F, 0F, 0F);
      blow_hole_7_part_3 = new ModelRenderer(this, 0, 0);
      blow_hole_7_part_3.addBox(-9F, -3F, 10F, 1, 3, 1);
      blow_hole_7_part_3.setRotationPoint(1F, 7F, 1F);
      blow_hole_7_part_3.setTextureSize(256, 128);
      blow_hole_7_part_3.mirror = true;
      setRotation(blow_hole_7_part_3, 0F, 0F, 0F);
      blow_hole_7_part_4 = new ModelRenderer(this, 0, 0);
      blow_hole_7_part_4.addBox(-9F, -3F, 12F, 1, 3, 1);
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
      top_blow_hole_3_part_1.addBox(5F, -9F, 0F, 3, 1, 1);
      top_blow_hole_3_part_1.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_3_part_1.setTextureSize(256, 128);
      top_blow_hole_3_part_1.mirror = true;
      setRotation(top_blow_hole_3_part_1, 0F, 0F, 0F);
      top_blow_hole_3_part_4 = new ModelRenderer(this, 0, 0);
      top_blow_hole_3_part_4.addBox(5F, -9F, -2F, 3, 1, 1);
      top_blow_hole_3_part_4.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_3_part_4.setTextureSize(256, 128);
      top_blow_hole_3_part_4.mirror = true;
      setRotation(top_blow_hole_3_part_4, 0F, 0F, 0F);
      top_blow_hole_3_part_3 = new ModelRenderer(this, 0, 0);
      top_blow_hole_3_part_3.addBox(7F, -9F, -1F, 1, 1, 1);
      top_blow_hole_3_part_3.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_3_part_3.setTextureSize(256, 128);
      top_blow_hole_3_part_3.mirror = true;
      setRotation(top_blow_hole_3_part_3, 0F, 0F, 0F);
      top_blow_hole_3_part_2 = new ModelRenderer(this, 0, 0);
      top_blow_hole_3_part_2.addBox(5F, -9F, -1F, 1, 1, 1);
      top_blow_hole_3_part_2.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_3_part_2.setTextureSize(256, 128);
      top_blow_hole_3_part_2.mirror = true;
      setRotation(top_blow_hole_3_part_2, 0F, 0F, 0F);
      top_blow_hole_2_part_1 = new ModelRenderer(this, 0, 0);
      top_blow_hole_2_part_1.addBox(7F, -9F, 10F, 3, 1, 1);
      top_blow_hole_2_part_1.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_2_part_1.setTextureSize(256, 128);
      top_blow_hole_2_part_1.mirror = true;
      setRotation(top_blow_hole_2_part_1, 0F, 0F, 0F);
      top_blow_hole_2_part_4 = new ModelRenderer(this, 0, 0);
      top_blow_hole_2_part_4.addBox(7F, -9F, 8F, 3, 1, 1);
      top_blow_hole_2_part_4.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_2_part_4.setTextureSize(256, 128);
      top_blow_hole_2_part_4.mirror = true;
      setRotation(top_blow_hole_2_part_4, 0F, 0F, 0F);
      top_blow_hole_2_part_3 = new ModelRenderer(this, 0, 0);
      top_blow_hole_2_part_3.addBox(7F, -9F, 9F, 1, 1, 1);
      top_blow_hole_2_part_3.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_2_part_3.setTextureSize(256, 128);
      top_blow_hole_2_part_3.mirror = true;
      setRotation(top_blow_hole_2_part_3, 0F, 0F, 0F);
      top_blow_hole_2_part_2 = new ModelRenderer(this, 0, 0);
      top_blow_hole_2_part_2.addBox(9F, -9F, 9F, 1, 1, 1);
      top_blow_hole_2_part_2.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_2_part_2.setTextureSize(256, 128);
      top_blow_hole_2_part_2.mirror = true;
      setRotation(top_blow_hole_2_part_2, 0F, 0F, 0F);
      top_blow_hole_1_part_1 = new ModelRenderer(this, 0, 0);
      top_blow_hole_1_part_1.addBox(-4F, -9F, 11F, 3, 1, 1);
      top_blow_hole_1_part_1.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_1_part_1.setTextureSize(256, 128);
      top_blow_hole_1_part_1.mirror = true;
      setRotation(top_blow_hole_1_part_1, 0F, 0F, 0F);
      top_blow_hole_1_part_4 = new ModelRenderer(this, 0, 0);
      top_blow_hole_1_part_4.addBox(-4F, -9F, 9F, 3, 1, 1);
      top_blow_hole_1_part_4.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_1_part_4.setTextureSize(256, 128);
      top_blow_hole_1_part_4.mirror = true;
      setRotation(top_blow_hole_1_part_4, 0F, 0F, 0F);
      top_blow_hole_1_part_3 = new ModelRenderer(this, 0, 0);
      top_blow_hole_1_part_3.addBox(-2F, -9F, 10F, 1, 1, 1);
      top_blow_hole_1_part_3.setRotationPoint(1F, 7F, 1F);
      top_blow_hole_1_part_3.setTextureSize(256, 128);
      top_blow_hole_1_part_3.mirror = true;
      setRotation(top_blow_hole_1_part_3, 0F, 0F, 0F);
      top_blow_hole_1_part_2 = new ModelRenderer(this, 0, 0);
      top_blow_hole_1_part_2.addBox(-4F, -9F, 10F, 1, 1, 1);
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
      middle_Side = new ModelRenderer(this, 0, 80);
      middle_Side.addBox(-6F, -6F, -8F, 22, 22, 26);
      middle_Side.setRotationPoint(1F, 7F, 1F);
      middle_Side.setTextureSize(256, 128);
      middle_Side.mirror = true;
      setRotation(middle_Side, 0F, 0F, 0F);
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
      
      Main_body.addChild(Weezing_pipe);
      Main_body.addChild(Weezing_second_head_pipe);
      Main_body.addChild(BB_middle);
      Main_body.addChild(BB_Vertical_side);
      Main_body.addChild(BB_horizontal_side);
      Main_body.addChild(BB_middle_side);
      Main_body.addChild(SBH1_pt_1);
      Main_body.addChild(SBH1_pt_2);
      Main_body.addChild(SBH1_pt_3);
      Main_body.addChild(SBH1_pt_4);
      Main_body.addChild(SBH2_pt_1);
      Main_body.addChild(SBH2_pt_2);
      Main_body.addChild(SBH2_pt_3);
      Main_body.addChild(SBH2_pt_4);
      Main_body.addChild(SBH3_pt_1);
      Main_body.addChild(SBH3_pt_2);
      Main_body.addChild(SBH3_pt_3);
      Main_body.addChild(SBH3_pt_4);
      Main_body.addChild(SBH4_pt_1);
      Main_body.addChild(SBH4_pt_2);
      Main_body.addChild(SBH4_pt_3);
      Main_body.addChild(SBH4_pt_4);
      Main_body.addChild(Secondary_middle);
      Main_body.addChild(Secondary_Horizontal_side);
      Main_body.addChild(Secondary_Virtical_side);
      Main_body.addChild(Secondary_Middle_side);
      Main_body.addChild(blow_hole_11_part_1);
      Main_body.addChild(blow_hole_11_part_2);
      Main_body.addChild(blow_hole_11_part_3);
      Main_body.addChild(blow_hole_11_part_4);
      Main_body.addChild(blow_hole_10_part_1);
      Main_body.addChild(blow_hole_10_part_2);
      Main_body.addChild(blow_hole_10_part_3);
      Main_body.addChild(blow_hole_10_part_4);
      Main_body.addChild(blow_hole_9_part_1);
      Main_body.addChild(blow_hole_9_part_2);
      Main_body.addChild(blow_hole_9_part_3);
      Main_body.addChild(blow_hole_9_part_4);
      Main_body.addChild(blow_hole_8_part_1);
      Main_body.addChild(blow_hole_8_part_2);
      Main_body.addChild(blow_hole_8_part_3);
      Main_body.addChild(blow_hole_8_part_4);
      Main_body.addChild(blow_hole_7_part_1);
      Main_body.addChild(blow_hole_7_part_2);
      Main_body.addChild(blow_hole_7_part_3);
      Main_body.addChild(blow_hole_7_part_4);
      Main_body.addChild(top_blow_hole_6_part_1);
      Main_body.addChild(top_blow_hole_6_part_2);
      Main_body.addChild(top_blow_hole_6_part_3);
      Main_body.addChild(top_blow_hole_6_part_4);
      Main_body.addChild(top_blow_hole_5_part_1);
      Main_body.addChild(top_blow_hole_5_part_2);
      Main_body.addChild(top_blow_hole_5_part_3);
      Main_body.addChild(top_blow_hole_5_part_4);
      Main_body.addChild(top_blow_hole_4_part_1);
      Main_body.addChild(top_blow_hole_4_part_2);
      Main_body.addChild(top_blow_hole_4_part_3);
      Main_body.addChild(top_blow_hole_4_part_4);
      Main_body.addChild(top_blow_hole_3_part_1);
      Main_body.addChild(top_blow_hole_3_part_2);
      Main_body.addChild(top_blow_hole_3_part_3);
      Main_body.addChild(top_blow_hole_3_part_4);
      Main_body.addChild(top_blow_hole_2_part_1);
      Main_body.addChild(top_blow_hole_2_part_2);
      Main_body.addChild(top_blow_hole_2_part_3);
      Main_body.addChild(top_blow_hole_2_part_4);
      Main_body.addChild(top_blow_hole_1_part_1);
      Main_body.addChild(top_blow_hole_1_part_2);
      Main_body.addChild(top_blow_hole_1_part_3);
      Main_body.addChild(top_blow_hole_1_part_4);
      Main_body.addChild(main_middle);
      Main_body.addChild(middle_Side);
      Main_body.addChild(vertical_side);
      Main_body.addChild(horizontal_side);
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
  }

}
