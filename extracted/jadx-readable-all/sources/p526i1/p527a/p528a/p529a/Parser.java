package p526i1.p527a.p528a.p529a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: renamed from: i1.a.a.a.m, reason: use source file name */
/* JADX INFO: compiled from: Parser.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Parser implements CommandLineParser {

    /* JADX INFO: renamed from: a */
    public CommandLine f30790a;

    /* JADX INFO: renamed from: b */
    public Options3 f30791b;

    /* JADX INFO: renamed from: c */
    public List f30792c;

    /* JADX WARN: Code duplicated, block: B:69:0x0167  */
    @Override // p526i1.p527a.p528a.p529a.CommandLineParser
    /* JADX INFO: renamed from: a */
    public CommandLine mo13795a(Options3 options3, String[] strArr, boolean z) throws ParseException {
        Objects.requireNonNull(options3);
        Iterator it = new ArrayList(options3.f30786f.values()).iterator();
        while (it.hasNext()) {
            ((Option2) it.next()).f30783k.clear();
        }
        this.f30791b = options3;
        this.f30792c = new ArrayList(options3.f30788h);
        this.f30790a = new CommandLine();
        if (strArr == null) {
            strArr = new String[0];
        }
        ListIterator listIterator = Arrays.asList(mo13796b(this.f30791b, strArr, z)).listIterator();
        boolean z2 = false;
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if ("--".equals(str)) {
                z2 = true;
            } else if ("-".equals(str)) {
                if (z) {
                    z2 = true;
                } else {
                    this.f30790a.f30768f.add(str);
                }
            } else if (!str.startsWith("-")) {
                this.f30790a.f30768f.add(str);
                if (z) {
                    z2 = true;
                }
            } else if (z && !this.f30791b.m13807c(str)) {
                this.f30790a.f30768f.add(str);
                z2 = true;
            } else {
                if (!this.f30791b.m13807c(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Unrecognized option: ");
                    stringBuffer.append(str);
                    throw new UnrecognizedOptionException(stringBuffer.toString(), str);
                }
                Option2 option2 = (Option2) this.f30791b.m13806b(str).clone();
                if (((OptionGroup) this.f30791b.f30789i.get(option2.m13802b())) != null) {
                    OptionGroup optionGroup = (OptionGroup) this.f30791b.f30789i.get(option2.m13802b());
                    Objects.requireNonNull(optionGroup);
                    String str2 = optionGroup.f30785g;
                    if (str2 != null && !str2.equals(option2.f30778f)) {
                        throw new AlreadySelectedException(optionGroup, option2);
                    }
                    optionGroup.f30785g = option2.f30778f;
                }
                if (option2.m13804e()) {
                    while (listIterator.hasNext()) {
                        String strSubstring = (String) listIterator.next();
                        if (this.f30791b.m13807c(strSubstring) && strSubstring.startsWith("-")) {
                            listIterator.previous();
                            break;
                        }
                        try {
                            if (strSubstring.startsWith("\"")) {
                                strSubstring = strSubstring.substring(1, strSubstring.length());
                            }
                            if (strSubstring.endsWith("\"")) {
                                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                            }
                            if (option2.f30782j == -1) {
                                throw new RuntimeException("NO_ARGS_ALLOWED");
                            }
                            option2.m13801a(strSubstring);
                        } catch (RuntimeException unused) {
                            listIterator.previous();
                        }
                    }
                    if (option2.m13803d() == null) {
                        throw new MissingArgumentException(option2);
                    }
                }
                this.f30790a.f30769g.add(option2);
            }
            if (z2) {
                while (listIterator.hasNext()) {
                    String str3 = (String) listIterator.next();
                    if (!"--".equals(str3)) {
                        this.f30790a.f30768f.add(str3);
                    }
                }
            }
        }
        if (this.f30792c.isEmpty()) {
            return this.f30790a;
        }
        throw new MissingOptionException(this.f30792c);
    }

    /* JADX INFO: renamed from: b */
    public abstract String[] mo13796b(Options3 options3, String[] strArr, boolean z);
}
