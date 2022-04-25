package com.pwddd.dz.common;

public class MenuConstant {

    public static final String BANNER  = "  ____                      _       _ _        _____           _     "+"       "+ConfigConstant.DZ_VERSION+"\n" +
            " |  _ \\  ___  ___  ___ _ __(_) __ _| (_)______|_   _|__   ___ | |___\n" +
            " | | | |/ _ \\/ __|/ _ \\ '__| |/ _` | | |_  / _ \\| |/ _ \\ / _ \\| / __|\n" +
            " | |_| |  __/\\__ \\  __/ |  | | (_| | | |/ /  __/| | (_) | (_) | \\__ \\\n" +
            " |____/ \\___||___/\\___|_|  |_|\\__,_|_|_/___\\___||_|\\___/ \\___/|_|___/\n" +
            "                                                                     "  + "        by p0jo";

    public static final String USAGE = "Usage: java -jar dz.jar [options] " +
            "options:\n" +
            "  -g, --gui             Use DZ by GUI program.  [TODO]\n" + // TODO
            "  -h, --help            Show this help message.\n" +
            "  -v, --version         Show program's version number.\n";

    public static final String USAGE_WITH_COLOR = "Usage: java -jar dz.jar [options] " +
            "options:\n" +
            "  -g, --gui             Use DZ by GUI program.  \033[32;4m[TODO]\033[0m \n" + // TODO
            "  -h, --help            Show this help message.\n" +
            "  -v, --version         Show program's version number.\n";;

}
