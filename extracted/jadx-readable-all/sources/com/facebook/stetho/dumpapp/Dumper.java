package com.facebook.stetho.dumpapp;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p526i1.p527a.p528a.p529a.CommandLine;
import p526i1.p527a.p528a.p529a.CommandLineParser;
import p526i1.p527a.p528a.p529a.GnuParser;
import p526i1.p527a.p528a.p529a.HelpFormatter2;
import p526i1.p527a.p528a.p529a.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class Dumper {
    private final Map<String, DumperPlugin> mDumperPlugins;
    private final GlobalOptions mGlobalOptions;
    private final CommandLineParser mParser;

    public Dumper(Iterable<DumperPlugin> iterable) {
        this(iterable, new GnuParser());
    }

    private int doDump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) throws DumpException, ParseException {
        CommandLine commandLineMo13795a = this.mParser.mo13795a(this.mGlobalOptions.options, strArr, true);
        if (commandLineMo13795a.m13794a(this.mGlobalOptions.optionHelp.f30778f)) {
            dumpUsage(printStream);
            return 0;
        }
        if (commandLineMo13795a.m13794a(this.mGlobalOptions.optionListPlugins.f30778f)) {
            dumpAvailablePlugins(printStream);
            return 0;
        }
        if (commandLineMo13795a.f30768f.isEmpty()) {
            dumpUsage(printStream2);
            return 1;
        }
        dumpPluginOutput(inputStream, printStream, printStream2, commandLineMo13795a);
        return 0;
    }

    private void dumpAvailablePlugins(PrintStream printStream) {
        ArrayList arrayList = new ArrayList();
        Iterator<DumperPlugin> it = this.mDumperPlugins.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        Collections.sort(arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            printStream.println((String) it2.next());
        }
    }

    private void dumpPluginOutput(InputStream inputStream, PrintStream printStream, PrintStream printStream2, CommandLine commandLine) throws DumpException {
        ArrayList arrayList = new ArrayList(commandLine.f30768f);
        if (arrayList.size() < 1) {
            throw new DumpException("Expected plugin argument");
        }
        String str = (String) arrayList.remove(0);
        DumperPlugin dumperPlugin = this.mDumperPlugins.get(str);
        if (dumperPlugin == null) {
            throw new DumpException(outline.m1600v("No plugin named '", str, "'"));
        }
        dumperPlugin.dump(new DumperContext(inputStream, printStream, printStream2, this.mParser, arrayList));
    }

    private void dumpUsage(PrintStream printStream) {
        HelpFormatter2 helpFormatter2 = new HelpFormatter2();
        printStream.println("Usage: dumpapp [options] <plugin> [plugin-options]");
        PrintWriter printWriter = new PrintWriter(printStream);
        try {
            helpFormatter2.m13799c(printWriter, helpFormatter2.f30770a, this.mGlobalOptions.options, helpFormatter2.f30771b, helpFormatter2.f30772c);
        } finally {
            printWriter.flush();
        }
    }

    private static Map<String, DumperPlugin> generatePluginMap(Iterable<DumperPlugin> iterable) {
        HashMap map = new HashMap();
        for (DumperPlugin dumperPlugin : iterable) {
            map.put(dumperPlugin.getName(), dumperPlugin);
        }
        return Collections.unmodifiableMap(map);
    }

    public int dump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) {
        try {
            return doDump(inputStream, printStream, printStream2, strArr);
        } catch (DumpException e) {
            printStream2.println(e.getMessage());
            return 1;
        } catch (DumpappOutputBrokenException e2) {
            throw e2;
        } catch (ParseException e3) {
            printStream2.println(e3.getMessage());
            dumpUsage(printStream2);
            return 1;
        } catch (RuntimeException e4) {
            e4.printStackTrace(printStream2);
            return 1;
        }
    }

    public Dumper(Iterable<DumperPlugin> iterable, CommandLineParser commandLineParser) {
        this.mDumperPlugins = generatePluginMap(iterable);
        this.mParser = commandLineParser;
        this.mGlobalOptions = new GlobalOptions();
    }
}
