package com.pwddd.dz.common;

import com.pwddd.cpt.Colorful;
import com.pwddd.cpt.enums.FontColor;

public class MenuConstant {

    public static final String BANNER  = "  ____                      _       _ _        _____           _     "+"       "+ConfigConstant.DZ_VERSION+"\n" +
            " |  _ \\  ___  ___  ___ _ __(_) __ _| (_)______|_   _|__   ___ | |___\n" +
            " | | | |/ _ \\/ __|/ _ \\ '__| |/ _` | | |_  / _ \\| |/ _ \\ / _ \\| / __|\n" +
            " | |_| |  __/\\__ \\  __/ |  | | (_| | | |/ /  __/| | (_) | (_) | \\__ \\\n" +
            " |____/ \\___||___/\\___|_|  |_|\\__,_|_|_/___\\___||_|\\___/ \\___/|_|___/\n" +
            "                                                                     "  + "        by p0jo";



    public static final String USAGE = "Usage: java -jar dz.jar [options] \n" +
            "options:\n" +
            "  -d                                     Use SerializationDumper to Dump. \n" +
            "  -g, --gui                              Use DZ by GUI program."+
            Colorful.format("[TODO]", FontColor.GREEN) +"\n" + // TODO
            "  -h, --help                             Show this help message.\n" +
            "  -y                                     Use Ysoserial to Generate payload. \n" +
            "  -v, --version                          Show program's version number.\n\n";

    /**
     * ysoserial的使用options
     */
    public static final String Y_USAGE = "ysoserial Usage: java -jar dz.jar -y [payload] '[command]' \n\n";


    /**
     * serializationDumper的使用options
     */
    public static final String D_USAGE = "SerializationDumper Usage: java -jar dz.jar -d [options] \n"
            + "options:\n"
            + "<hex-ascii-data>                         hex-ascii-data \n"
            + "-f <file-containing-hex-ascii>           file-containing-hex-ascii\n"
            + "-r <file-containing-raw-data>            file-containing-raw-data \n"  ;

    public static final String FULL_USAGE = USAGE + Y_USAGE + D_USAGE;


}
