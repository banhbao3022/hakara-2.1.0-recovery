package p007c.p190n.p430e;

import java.lang.reflect.Field;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c.n.e.d, reason: use source file name */
/* JADX INFO: compiled from: FieldNamingPolicy.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldNamingPolicy implements FieldNamingStrategy {

    /* JADX INFO: renamed from: f */
    public static final FieldNamingPolicy f27316f;

    /* JADX INFO: renamed from: g */
    public static final FieldNamingPolicy f27317g;

    /* JADX INFO: renamed from: h */
    public static final FieldNamingPolicy f27318h;

    /* JADX INFO: renamed from: i */
    public static final FieldNamingPolicy f27319i;

    /* JADX INFO: renamed from: j */
    public static final FieldNamingPolicy f27320j;

    /* JADX INFO: renamed from: k */
    public static final FieldNamingPolicy f27321k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ FieldNamingPolicy[] f27322l;

    /* JADX INFO: renamed from: c.n.e.d$a */
    /* JADX INFO: compiled from: FieldNamingPolicy.java */
    public final enum a extends FieldNamingPolicy {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // p007c.p190n.p430e.FieldNamingStrategy
        /* JADX INFO: renamed from: f */
        public String mo12219f(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f27316f = aVar;
        FieldNamingPolicy fieldNamingPolicy = new FieldNamingPolicy("UPPER_CAMEL_CASE", 1) { // from class: c.n.e.d.b
            @Override // p007c.p190n.p430e.FieldNamingStrategy
            /* JADX INFO: renamed from: f */
            public String mo12219f(Field field) {
                return FieldNamingPolicy.m12218j(field.getName());
            }
        };
        f27317g = fieldNamingPolicy;
        FieldNamingPolicy fieldNamingPolicy2 = new FieldNamingPolicy("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: c.n.e.d.c
            @Override // p007c.p190n.p430e.FieldNamingStrategy
            /* JADX INFO: renamed from: f */
            public String mo12219f(Field field) {
                return FieldNamingPolicy.m12218j(FieldNamingPolicy.m12217h(field.getName(), " "));
            }
        };
        f27318h = fieldNamingPolicy2;
        FieldNamingPolicy fieldNamingPolicy3 = new FieldNamingPolicy("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: c.n.e.d.d
            @Override // p007c.p190n.p430e.FieldNamingStrategy
            /* JADX INFO: renamed from: f */
            public String mo12219f(Field field) {
                return FieldNamingPolicy.m12217h(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f27319i = fieldNamingPolicy3;
        FieldNamingPolicy fieldNamingPolicy4 = new FieldNamingPolicy("LOWER_CASE_WITH_DASHES", 4) { // from class: c.n.e.d.e
            @Override // p007c.p190n.p430e.FieldNamingStrategy
            /* JADX INFO: renamed from: f */
            public String mo12219f(Field field) {
                return FieldNamingPolicy.m12217h(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f27320j = fieldNamingPolicy4;
        FieldNamingPolicy fieldNamingPolicy5 = new FieldNamingPolicy("LOWER_CASE_WITH_DOTS", 5) { // from class: c.n.e.d.f
            @Override // p007c.p190n.p430e.FieldNamingStrategy
            /* JADX INFO: renamed from: f */
            public String mo12219f(Field field) {
                return FieldNamingPolicy.m12217h(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f27321k = fieldNamingPolicy5;
        f27322l = new FieldNamingPolicy[]{aVar, fieldNamingPolicy, fieldNamingPolicy2, fieldNamingPolicy3, fieldNamingPolicy4, fieldNamingPolicy5};
    }

    public FieldNamingPolicy(String str, int i, a aVar) {
        super(str, i);
    }

    /* JADX INFO: renamed from: h */
    public static String m12217h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m12218j(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char cCharAt = str.charAt(i);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i == 0) {
            StringBuilder sbM1555F = outline.m1555F(upperCase);
            sbM1555F.append(str.substring(1));
            return sbM1555F.toString();
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }

    public static FieldNamingPolicy valueOf(String str) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, str);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) f27322l.clone();
    }
}
