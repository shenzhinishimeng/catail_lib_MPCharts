
package com.github.mikephil.charting.utils;

import android.content.res.Resources;
import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that holds predefined color integer arrays (e.g.
 * ColorTemplate.VORDIPLOM_COLORS) and convenience methods for loading colors
 * from resources.
 *  使用rgb颜色
 * @author Philipp Jahoda
 */
public class ColorTemplate {

    /**
     * an "invalid" color that indicates that no color is set
     */
    public static final int COLOR_NONE = 0x00112233;

    /**
     * this "color" is used for the Legend creation and indicates that the next
     * form should be skipped
     */
    public static final int COLOR_SKIP = 0x00112234;

    /**
     * THE COLOR THEMES ARE PREDEFINED (predefined color integer arrays), FEEL
     * FREE TO CREATE YOUR OWN WITH AS MANY DIFFERENT COLORS AS YOU WANT
     */
    public static final int[] LIBERTY_COLORS = {
            Color.rgb(207, 248, 246), Color.rgb(148, 212, 212), Color.rgb(136, 180, 187),
            Color.rgb(118, 174, 175), Color.rgb(42, 109, 130)
    };
    public static final int[] JOYFUL_COLORS = {
            Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 167, 134), Color.rgb(53, 194, 209)
    };
    public static final int[] PASTEL_COLORS = {
            Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, 184, 162),
            Color.rgb(191, 134, 134), Color.rgb(179, 48, 80)
    };
    public static final int[] COLORFUL_COLORS = {
            Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, 199, 0),
            Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)
    };
    public static final int[] VORDIPLOM_COLORS = {
            Color.rgb(192, 255, 140), Color.rgb(255, 247, 140), Color.rgb(255, 208, 140),
            Color.rgb(140, 234, 255), Color.rgb(255, 140, 157)
    };
    public static final int[] MATERIAL_COLORS = {
            rgb("#2ecc71"), rgb("#f1c40f"), rgb("#e74c3c"), rgb("#3498db")
    };

    public static final int[] CHECKLIST_STATUS_COLORS = {
            Color.rgb(94, 209, 252), Color.rgb(254, 206, 181), Color.rgb(150, 223, 174)
    };

//    public static final int CHECKLIST_STATUS_0 = Color.rgb(94, 209, 252);
//    public static final int CHECKLIST_STATUS_1 = Color.rgb(254, 206, 181);
//    public static final int CHECKLIST_STATUS_3 = Color.rgb(150, 223, 174);

    public static final int[] INSPECTION_STATUS_COLORS = {
            rgb("#FA9A18"), rgb("#66CC76"), rgb("#FF6666"), rgb("#34B9FC")
    };
    public static final int[] INSPECTION_CHECKLIST_TYPE_COLORS = {
            rgb("#FB9A17"), rgb("#00AA53"), rgb("#0792D6"), rgb("#0741D6"),
            rgb("#EB07C6"), rgb("#F04141"), rgb("#CAE32D"), rgb("#09D442"),
            rgb("#07D6D6")
    };

    public static final int[] SAFETY_PTW_TYPE_COLORS = {
            rgb("#528DCC"), rgb("#29C939"), rgb("#258B2F"), rgb("#BB2929"),
            rgb("#E2641C"), rgb("#4650AD"), rgb("#E8E251"), rgb("#E16097"),
            rgb("#14BDA8"), rgb("#7B266D")
    };

    public static final int[] PIECHART_COLORS = {
            Color.rgb(254, 41, 68), Color.rgb(86, 99, 255), Color.rgb(252, 212, 79),
            Color.rgb(21, 220, 199), Color.rgb(  24, 188, 255), Color.rgb( 44, 255, 91),
            Color.rgb(254, 41, 68), Color.rgb(86, 99, 255), Color.rgb(252, 212, 79),
            Color.rgb(21, 220, 199), Color.rgb(  24, 188, 255), Color.rgb( 44, 255, 91),  Color.rgb(254, 41, 68), Color.rgb(86, 99, 255), Color.rgb(252, 212, 79),
            Color.rgb(21, 220, 199), Color.rgb(  24, 188, 255), Color.rgb( 44, 255, 91),  Color.rgb(254, 41, 68), Color.rgb(86, 99, 255), Color.rgb(252, 212, 79),
            Color.rgb(21, 220, 199), Color.rgb(  24, 188, 255), Color.rgb( 44, 255, 91),  Color.rgb(254, 41, 68), Color.rgb(86, 99, 255), Color.rgb(252, 212, 79),
            Color.rgb(21, 220, 199), Color.rgb(  24, 188, 255), Color.rgb( 44, 255, 91),
            Color.rgb(254, 41, 68), Color.rgb(86, 99, 255), Color.rgb(252, 212, 79),
            Color.rgb(21, 220, 199), Color.rgb(  24, 188, 255), Color.rgb( 44, 255, 91)

//            Color.rgb(0, 254, 165), Color.rgb(14, 254, 166), Color.rgb(28, 254, 166),
//            Color.rgb(142, 254, 164), Color.rgb(156, 254, 166), Color.rgb(169, 254, 140)
    };

    public static final int[] RFA_RFI_PIECHART_COLORS = {
//            Color.rgb(250, 211, 77), Color.rgb(84, 101, 254)
            Color.rgb(21, 220, 199), Color.rgb(86, 99, 255)
    };

    public static final int[] PURPLE_COLORS = {
            Color.rgb(85, 100, 255)
    };
    public static final int[] GRAY_TEXT_COLOR = {
            Color.rgb(195, 195, 195)
    };


    /**
     * Converts the given hex-color-string to rgb.
     *
     * @param hex
     * @return
     */
    public static int rgb(String hex) {
        int color = (int) Long.parseLong(hex.replace("#", ""), 16);
        int r = (color >> 16) & 0xFF;
        int g = (color >> 8) & 0xFF;
        int b = (color >> 0) & 0xFF;
        return Color.rgb(r, g, b);
    }

    /**
     * Returns the Android ICS holo blue light color.
     *
     * @return
     */
    public static int getHoloBlue() {
        return Color.rgb(51, 181, 229);
    }

    /**
     * Sets the alpha component of the given color.
     *
     * @param color
     * @param alpha 0 - 255
     * @return
     */
    public static int colorWithAlpha(int color, int alpha) {
        return (color & 0xffffff) | ((alpha & 0xff) << 24);
    }

    /**
     * turn an array of resource-colors (contains resource-id integers) into an
     * array list of actual color integers
     *
     * @param r
     * @param colors an integer array of resource id's of colors
     * @return
     */
    public static List<Integer> createColors(Resources r, int[] colors) {

        List<Integer> result = new ArrayList<Integer>();

        for (int i : colors) {
            result.add(r.getColor(i));
        }

        return result;
    }

    /**
     * Turns an array of colors (integer color values) into an ArrayList of
     * colors.
     *
     * @param colors
     * @return
     */
    public static List<Integer> createColors(int[] colors) {

        List<Integer> result = new ArrayList<Integer>();

        for (int i : colors) {
            result.add(i);
        }

        return result;
    }
}
