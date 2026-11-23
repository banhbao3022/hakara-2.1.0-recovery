package p007c.p190n.p430e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c.n.e.z, reason: use source file name */
/* JADX INFO: compiled from: LongSerializationPolicy.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class LongSerializationPolicy {

    /* JADX INFO: renamed from: f */
    public static final LongSerializationPolicy f27584f;

    /* JADX INFO: renamed from: g */
    public static final LongSerializationPolicy f27585g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ LongSerializationPolicy[] f27586h;

    /* JADX INFO: renamed from: c.n.e.z$a */
    /* JADX INFO: compiled from: LongSerializationPolicy.java */
    public final enum a extends LongSerializationPolicy {
        public a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f27584f = aVar;
        LongSerializationPolicy longSerializationPolicy = new LongSerializationPolicy("STRING", 1) { // from class: c.n.e.z.b
        };
        f27585g = longSerializationPolicy;
        f27586h = new LongSerializationPolicy[]{aVar, longSerializationPolicy};
    }

    public LongSerializationPolicy(String str, int i, a aVar) {
        super(str, i);
    }

    public static LongSerializationPolicy valueOf(String str) {
        return (LongSerializationPolicy) Enum.valueOf(LongSerializationPolicy.class, str);
    }

    public static LongSerializationPolicy[] values() {
        return (LongSerializationPolicy[]) f27586h.clone();
    }
}
