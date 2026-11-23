package p477d1.p493x.p495c;

import p007c.p071d.p078c.p079a.outline;
import p477d1.p479b0.KCallable;
import p477d1.p479b0.KProperty2;

/* JADX INFO: renamed from: d1.x.c.o, reason: use source file name */
/* JADX INFO: compiled from: PropertyReference.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class PropertyReference extends CallableReference implements KProperty2 {
    public PropertyReference() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return mo12498j().equals(propertyReference.mo12498j()) && this.f29587i.equals(propertyReference.f29587i) && this.f29588j.equals(propertyReference.f29588j) && Intrinsics2.m13085a(this.f29585g, propertyReference.f29585g);
        }
        if (obj instanceof KProperty2) {
            return obj.equals(m13080e());
        }
        return false;
    }

    public int hashCode() {
        return this.f29588j.hashCode() + outline.m1569T(this.f29587i, mo12498j().hashCode() * 31, 31);
    }

    public String toString() {
        KCallable kCallableM13080e = m13080e();
        return kCallableM13080e != this ? kCallableM13080e.toString() : outline.m1550A(outline.m1556G("property "), this.f29587i, " (Kotlin reflection is not available)");
    }

    public PropertyReference(Object obj) {
        super(obj);
    }

    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
