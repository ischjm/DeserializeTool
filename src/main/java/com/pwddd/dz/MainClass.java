package com.pwddd.dz;

import com.pwddd.cpt.Colorful;
import com.pwddd.cpt.enums.FontColor;
import com.pwddd.dz.common.CodeConstant;
import com.pwddd.dz.common.ConfigConstant;
import com.pwddd.dz.common.MenuConstant;

import java.util.*;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        int argsLen = args.length;
        if (argsLen <= 0){
            usage();
            System.exit(CodeConstant.ArgsNumError);
        }

        // 正常的参数
        if (argsLen == 1){
            switch (args[0]){
                case "-g" :
                case "--gui":
                    startGUI();
                    break;
                case "-v":
                case "--version":
                    System.out.println(ConfigConstant.DZ_VERSION);
                    break;
                default:
                    usage();
            }
        }
    }

    private static void startGUI() {
        System.out.println("Start GUI");
    }

    private static void usage() throws InterruptedException {
        System.out.println(Colorful.format(MenuConstant.BANNER, FontColor.PURPLE));
        Thread.sleep(5);
        System.err.println(MenuConstant.USAGE_WITH_COLOR);
    }
}
