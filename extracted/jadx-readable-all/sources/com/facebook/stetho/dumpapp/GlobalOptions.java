package com.facebook.stetho.dumpapp;

import p526i1.p527a.p528a.p529a.Option2;
import p526i1.p527a.p528a.p529a.Options3;

/* JADX INFO: loaded from: classes.dex */
public class GlobalOptions {
    public final Option2 optionHelp;
    public final Option2 optionListPlugins;
    public final Option2 optionProcess;
    public final Options3 options;

    public GlobalOptions() {
        Option2 option2 = new Option2("h", "help", false, "Print this help");
        this.optionHelp = option2;
        Option2 option3 = new Option2("l", "list", false, "List available plugins");
        this.optionListPlugins = option3;
        Option2 option4 = new Option2("p", "process", true, "Specify target process");
        this.optionProcess = option4;
        Options3 options3 = new Options3();
        this.options = options3;
        options3.m13805a(option2);
        options3.m13805a(option3);
        options3.m13805a(option4);
    }
}
