package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class db2 {

    /* JADX INFO: renamed from: f */
    public static final db2 f13204f;

    /* JADX INFO: renamed from: g */
    public static final db2 f13205g;

    /* JADX INFO: renamed from: h */
    public static final db2 f13206h;

    /* JADX INFO: renamed from: i */
    public static final db2 f13207i;

    /* JADX INFO: renamed from: j */
    public static final db2 f13208j;

    /* JADX INFO: renamed from: k */
    public static final db2 f13209k;

    /* JADX INFO: renamed from: l */
    public static final db2 f13210l;

    /* JADX INFO: renamed from: m */
    public static final db2 f13211m;

    /* JADX INFO: renamed from: n */
    public static final db2 f13212n;

    /* JADX INFO: renamed from: o */
    public static final db2 f13213o;

    /* JADX INFO: renamed from: p */
    public static final db2 f13214p;

    /* JADX INFO: renamed from: q */
    public static final db2 f13215q;

    /* JADX INFO: renamed from: r */
    public static final db2 f13216r;

    /* JADX INFO: renamed from: s */
    public static final db2 f13217s;

    /* JADX INFO: renamed from: t */
    public static final db2 f13218t;

    /* JADX INFO: renamed from: u */
    public static final db2 f13219u;

    /* JADX INFO: renamed from: v */
    public static final db2 f13220v;

    /* JADX INFO: renamed from: w */
    public static final db2 f13221w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ db2[] f13222x;

    /* JADX INFO: renamed from: y */
    public final eb2 f13223y;

    static {
        db2 db2Var = new db2("DOUBLE", 0, eb2.DOUBLE);
        f13204f = db2Var;
        db2 db2Var2 = new db2("FLOAT", 1, eb2.FLOAT);
        f13205g = db2Var2;
        eb2 eb2Var = eb2.LONG;
        db2 db2Var3 = new db2("INT64", 2, eb2Var);
        f13206h = db2Var3;
        db2 db2Var4 = new db2("UINT64", 3, eb2Var);
        f13207i = db2Var4;
        eb2 eb2Var2 = eb2.INT;
        db2 db2Var5 = new db2("INT32", 4, eb2Var2);
        f13208j = db2Var5;
        db2 db2Var6 = new db2("FIXED64", 5, eb2Var);
        f13209k = db2Var6;
        db2 db2Var7 = new db2("FIXED32", 6, eb2Var2);
        f13210l = db2Var7;
        db2 db2Var8 = new db2("BOOL", 7, eb2.BOOLEAN);
        f13211m = db2Var8;
        db2 db2Var9 = new db2("STRING", 8, eb2.STRING);
        f13212n = db2Var9;
        eb2 eb2Var3 = eb2.MESSAGE;
        db2 db2Var10 = new db2("GROUP", 9, eb2Var3);
        f13213o = db2Var10;
        db2 db2Var11 = new db2("MESSAGE", 10, eb2Var3);
        f13214p = db2Var11;
        db2 db2Var12 = new db2("BYTES", 11, eb2.BYTE_STRING);
        f13215q = db2Var12;
        db2 db2Var13 = new db2("UINT32", 12, eb2Var2);
        f13216r = db2Var13;
        db2 db2Var14 = new db2("ENUM", 13, eb2.ENUM);
        f13217s = db2Var14;
        db2 db2Var15 = new db2("SFIXED32", 14, eb2Var2);
        f13218t = db2Var15;
        db2 db2Var16 = new db2("SFIXED64", 15, eb2Var);
        f13219u = db2Var16;
        db2 db2Var17 = new db2("SINT32", 16, eb2Var2);
        f13220v = db2Var17;
        db2 db2Var18 = new db2("SINT64", 17, eb2Var);
        f13221w = db2Var18;
        f13222x = new db2[]{db2Var, db2Var2, db2Var3, db2Var4, db2Var5, db2Var6, db2Var7, db2Var8, db2Var9, db2Var10, db2Var11, db2Var12, db2Var13, db2Var14, db2Var15, db2Var16, db2Var17, db2Var18};
    }

    public db2(String str, int i, eb2 eb2Var) {
        super(str, i);
        this.f13223y = eb2Var;
    }

    public static db2[] values() {
        return (db2[]) f13222x.clone();
    }
}
