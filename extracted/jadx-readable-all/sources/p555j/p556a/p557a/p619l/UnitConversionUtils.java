package p555j.p556a.p557a.p619l;

import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.l.e, reason: use source file name */
/* JADX INFO: compiled from: UnitConversionUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UnitConversionUtils extends UnitConversionUtils3 {

    /* JADX INFO: renamed from: b */
    public static final UnitConversionUtils f33082b;

    /* JADX INFO: renamed from: c */
    public static final UnitConversionUtils f33083c;

    /* JADX INFO: renamed from: d */
    public static final a f33084d = new a(null);

    /* JADX INFO: renamed from: j.a.a.l.e$a */
    /* JADX INFO: compiled from: UnitConversionUtils.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new UnitConversionUtils("Mile", 1609.34d);
        f33082b = new UnitConversionUtils("Kilometer", 1000.0d);
        f33083c = new UnitConversionUtils("Meter", 1.0d);
        new UnitConversionUtils("Centimeter", 0.01d);
        new UnitConversionUtils("Millimeter", 0.001d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitConversionUtils(String str, double d) {
        super(str, d);
        Intrinsics2.m13089e(str, "name");
    }
}
