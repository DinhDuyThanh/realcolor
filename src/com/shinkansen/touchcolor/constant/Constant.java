package com.shinkansen.touchcolor.constant;


import com.shinkansen.touchcolor.R;

import android.graphics.Color;

public class Constant {
	public static final String[] COLOR =
		{"あかい","あおい","みどり","きいろ","オレンジ","パープル","ピンク","しろい","くろい"};
	public static final String[] COLOR_VI =
		{"Đỏ","Xanh lục","Xanh lá cây","Vàng","Cam","Tím","Hồng","Trắng","Xanh"};
	public static final String[] COLOR_EN =
		{"Red","Blue","Green","Yellow","Orange","Purple","Pink","White","Black"};
	public static final Integer[] COLOR_ID = {
		Color.parseColor("#FF0000"),
		Color.parseColor("#0000FF"),
		Color.parseColor("#008000"),
		Color.parseColor("#FFFF00"),
		Color.parseColor("#FFA500"),
		Color.parseColor("#800080"),
		Color.parseColor("#FFC0CB"),
		Color.parseColor("#FFFFFF"),
		Color.parseColor("#000000")};
	public static final Integer[] SOUND_ID = {
		R.raw.background,
		R.raw.red,
		R.raw.blue, 
		R.raw.green, 
		R.raw.yellow, 
		R.raw.orange,
		R.raw.purple,
		R.raw.pink,
		R.raw.white,
		R.raw.black,
		R.raw.corect,
		R.raw.incorrect,
		R.raw.study,
		R.raw.remember
		};
	
	public static final Integer[] SOUND_ID_VI = {
		R.raw.background,
		R.raw.red_vi,
		R.raw.blue_vi, 
		R.raw.green_vi, 
		R.raw.yellow_vi, 
		R.raw.orange_vi,
		R.raw.purple_vi,
		R.raw.pink_vi,
		R.raw.white_vi,
		R.raw.black_vi,
		R.raw.corect,
		R.raw.incorrect,
		R.raw.study,
		R.raw.remember
		};
	
	public static final Integer[] SOUND_ID_EN = {
		R.raw.background,
		R.raw.red_en,
		R.raw.blue_en, 
		R.raw.green_en, 
		R.raw.yellow_en, 
		R.raw.orange_en,
		R.raw.purple_en,
		R.raw.pink_en,
		R.raw.white_en,
		R.raw.black_en,
		R.raw.corect,
		R.raw.incorrect,
		R.raw.study,
		R.raw.remember
		};
	
	public static final int[] SAD_IMG = {
		R.drawable.sad1,
		R.drawable.sad2,
		R.drawable.sad3,
		R.drawable.sad4,
		R.drawable.sad5,
		R.drawable.sad6
	
	};
	
	public static final int[] SMILE_IMG = {
		R.drawable.smile1,
		R.drawable.smile2,
		R.drawable.smile3,
		R.drawable.smile4,
		R.drawable.smile5,
		R.drawable.smile6,
		R.drawable.smile7
	};
	
}
