package p477d1.p481d0;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.d0.f, reason: use source file name */
/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Regex2 implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final a f29466f = new a(null);

    /* JADX INFO: renamed from: g */
    public final Pattern f29467g;

    /* JADX INFO: renamed from: d1.d0.f$a */
    /* JADX INFO: compiled from: Regex.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: d1.d0.f$b */
    /* JADX INFO: compiled from: Regex.kt */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: f */
        public final String f29468f;

        /* JADX INFO: renamed from: g */
        public final int f29469g;

        /* JADX INFO: renamed from: d1.d0.f$b$a */
        /* JADX INFO: compiled from: Regex.kt */
        public static final class a {
            public a() {
            }

            public a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            new a(null);
        }

        public b(String str, int i) {
            Intrinsics2.m13089e(str, "pattern");
            this.f29468f = str;
            this.f29469g = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f29468f, this.f29469g);
            Intrinsics2.m13088d(patternCompile, "Pattern.compile(pattern, flags)");
            return new Regex2(patternCompile);
        }
    }

    public Regex2(Pattern pattern) {
        Intrinsics2.m13089e(pattern, "nativePattern");
        this.f29467g = pattern;
    }

    private final Object writeReplace() {
        String strPattern = this.f29467g.pattern();
        Intrinsics2.m13088d(strPattern, "nativePattern.pattern()");
        return new b(strPattern, this.f29467g.flags());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12982a(CharSequence charSequence) {
        Intrinsics2.m13089e(charSequence, "input");
        return this.f29467g.matcher(charSequence).matches();
    }

    /* JADX INFO: renamed from: b */
    public final String m12983b(CharSequence charSequence, String str) {
        Intrinsics2.m13089e(charSequence, "input");
        Intrinsics2.m13089e(str, "replacement");
        String strReplaceAll = this.f29467g.matcher(charSequence).replaceAll(str);
        Intrinsics2.m13088d(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.f29467g.toString();
        Intrinsics2.m13088d(string, "nativePattern.toString()");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex2(String str) {
        Intrinsics2.m13089e(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        Intrinsics2.m13088d(patternCompile, "Pattern.compile(pattern)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex2(String str, Regex3 regex3) {
        Intrinsics2.m13089e(str, "pattern");
        Intrinsics2.m13089e(regex3, "option");
        a aVar = f29466f;
        int i = regex3.f29471g;
        Objects.requireNonNull(aVar);
        Pattern patternCompile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        Intrinsics2.m13088d(patternCompile, "Pattern.compile(pattern,…nicodeCase(option.value))");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex2(String str, Set<? extends Regex3> set) {
        Intrinsics2.m13089e(str, "pattern");
        Intrinsics2.m13089e(set, "options");
        a aVar = f29466f;
        Iterator<T> it = set.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((Regex) it.next()).getValue();
        }
        Objects.requireNonNull(aVar);
        Pattern patternCompile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        Intrinsics2.m13088d(patternCompile, "Pattern.compile(pattern,…odeCase(options.toInt()))");
        this(patternCompile);
    }
}
