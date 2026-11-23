package com.facebook.stetho.dumpapp.plugins;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class SharedPreferencesDumperPlugin implements DumperPlugin {
    private static final String NAME = "prefs";
    private static final String XML_SUFFIX = ".xml";
    private final Context mAppContext;

    /* JADX INFO: renamed from: com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$1 */
    public static /* synthetic */ class C58171 {

        /* JADX INFO: renamed from: $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type */
        public static final /* synthetic */ int[] f28296x96b4f424;

        static {
            Type.values();
            int[] iArr = new int[6];
            f28296x96b4f424 = iArr;
            try {
                iArr[Type.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28296x96b4f424[Type.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28296x96b4f424[Type.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28296x96b4f424[Type.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28296x96b4f424[Type.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28296x96b4f424[Type.SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum Type {
        BOOLEAN("boolean"),
        INT("int"),
        LONG("long"),
        FLOAT("float"),
        STRING("string"),
        SET("set");

        private final String name;

        Type(String str) {
            this.name = str;
        }

        public static StringBuilder appendNamesList(StringBuilder sb, String str) {
            Type[] typeArrValues = values();
            boolean z = true;
            for (int i = 0; i < 6; i++) {
                Type type = typeArrValues[i];
                if (z) {
                    z = false;
                } else {
                    sb.append(str);
                }
                sb.append(type.name);
            }
            return sb;
        }

        /* JADX INFO: renamed from: of */
        public static Type m12615of(String str) {
            Type[] typeArrValues = values();
            for (int i = 0; i < 6; i++) {
                Type type = typeArrValues[i];
                if (type.name.equals(str)) {
                    return type;
                }
            }
            return null;
        }
    }

    public SharedPreferencesDumperPlugin(Context context) {
        this.mAppContext = context.getApplicationContext();
    }

    private void doPrint(PrintStream printStream, List<String> list) {
        printRecursive(printStream, outline.m1550A(new StringBuilder(), this.mAppContext.getApplicationInfo().dataDir, "/shared_prefs"), "", list.isEmpty() ? "" : list.get(0), list.size() > 1 ? list.get(1) : "");
    }

    private void doUsage(PrintStream printStream) {
        printStream.println("Usage: dumpapp prefs <command> [command-options]");
        printStream.println("Usage: dumpapp prefs print [pathPrefix [keyPrefix]]");
        StringBuilder sb = new StringBuilder("       dumpapp prefs ");
        sb.append("write <path> <key> <");
        StringBuilder sbAppendNamesList = Type.appendNamesList(sb, "|");
        sbAppendNamesList.append("> <value>");
        printStream.println(sbAppendNamesList);
        printStream.println();
        printStream.println("dumpapp prefs print: Print all matching values from the shared preferences");
        printStream.println();
        printStream.println("dumpapp prefs write: Writes a value to the shared preferences");
    }

    @SuppressLint({"CommitPrefEdits"})
    private void doWrite(List<String> list) throws DumpUsageException {
        Iterator<String> it = list.iterator();
        String strNextArg = nextArg(it, "Expected <path>");
        String strNextArg2 = nextArg(it, "Expected <key>");
        Type typeM12615of = Type.m12615of(nextArg(it, "Expected <type>"));
        if (typeM12615of == null) {
            throw new DumpUsageException(Type.appendNamesList(new StringBuilder("Usage: prefs write <path> <key> <type> <value>, where type is one of: "), ", ").toString());
        }
        SharedPreferences.Editor editorEdit = getSharedPreferences(strNextArg).edit();
        int iOrdinal = typeM12615of.ordinal();
        if (iOrdinal == 0) {
            editorEdit.putBoolean(strNextArg2, Boolean.valueOf(nextArgValue(it)).booleanValue());
        } else if (iOrdinal == 1) {
            editorEdit.putInt(strNextArg2, Integer.valueOf(nextArgValue(it)).intValue());
        } else if (iOrdinal == 2) {
            editorEdit.putLong(strNextArg2, Long.valueOf(nextArgValue(it)).longValue());
        } else if (iOrdinal == 3) {
            editorEdit.putFloat(strNextArg2, Float.valueOf(nextArgValue(it)).floatValue());
        } else if (iOrdinal == 4) {
            editorEdit.putString(strNextArg2, nextArgValue(it));
        } else if (iOrdinal == 5) {
            putStringSet(editorEdit, strNextArg2, it);
        }
        editorEdit.commit();
    }

    private SharedPreferences getSharedPreferences(String str) {
        return this.mAppContext.getSharedPreferences(str, 4);
    }

    private static String nextArg(Iterator<String> it, String str) throws DumpUsageException {
        if (it.hasNext()) {
            return it.next();
        }
        throw new DumpUsageException(str);
    }

    private static String nextArgValue(Iterator<String> it) throws DumpUsageException {
        return nextArg(it, "Expected <value>");
    }

    private void printFile(PrintStream printStream, String str, String str2) {
        printStream.println(str + ":");
        for (Map.Entry<String, ?> entry : SharedPreferencesHelper.getSharedPreferenceEntriesSorted(getSharedPreferences(str))) {
            if (entry.getKey().startsWith(str2)) {
                StringBuilder sbM1556G = outline.m1556G("  ");
                sbM1556G.append(entry.getKey());
                sbM1556G.append(" = ");
                sbM1556G.append(entry.getValue());
                printStream.println(sbM1556G.toString());
            }
        }
    }

    private void printRecursive(PrintStream printStream, String str, String str2, String str3, String str4) {
        String[] list;
        String string;
        File file = new File(str, str2);
        if (file.isFile()) {
            if (str2.endsWith(XML_SUFFIX)) {
                printFile(printStream, str2.substring(0, str2.length() - 4), str4);
            }
        } else {
            if (!file.isDirectory() || (list = file.list()) == null) {
                return;
            }
            for (int i = 0; i < list.length; i++) {
                if (TextUtils.isEmpty(str2)) {
                    string = list[i];
                } else {
                    StringBuilder sbM1556G = outline.m1556G(str2);
                    sbM1556G.append(File.separator);
                    sbM1556G.append(list[i]);
                    string = sbM1556G.toString();
                }
                String str5 = string;
                if (str5.startsWith(str3)) {
                    printRecursive(printStream, str, str5, str3, str4);
                }
            }
        }
    }

    @TargetApi(11)
    private static void putStringSet(SharedPreferences.Editor editor, String str, Iterator<String> it) {
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        editor.putStringSet(str, hashSet);
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public void dump(DumperContext dumperContext) throws DumpUsageException {
        PrintStream stdout = dumperContext.getStdout();
        List<String> argsAsList = dumperContext.getArgsAsList();
        String strRemove = argsAsList.isEmpty() ? "" : argsAsList.remove(0);
        if (strRemove.equals("print")) {
            doPrint(stdout, argsAsList);
        } else if (strRemove.equals("write")) {
            doWrite(argsAsList);
        } else {
            doUsage(stdout);
        }
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public String getName() {
        return NAME;
    }
}
