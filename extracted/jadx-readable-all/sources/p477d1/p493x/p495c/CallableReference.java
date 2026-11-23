package p477d1.p493x.p495c;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;
import p477d1.p479b0.KCallable;
import p477d1.p479b0.KDeclarationContainer;

/* JADX INFO: renamed from: d1.x.c.b, reason: use source file name */
/* JADX INFO: compiled from: CallableReference.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class CallableReference implements KCallable, Serializable {

    /* JADX INFO: renamed from: f */
    public transient KCallable f29584f;

    /* JADX INFO: renamed from: g */
    public final Object f29585g;

    /* JADX INFO: renamed from: h */
    public final Class f29586h;

    /* JADX INFO: renamed from: i */
    public final String f29587i;

    /* JADX INFO: renamed from: j */
    public final String f29588j;

    /* JADX INFO: renamed from: k */
    public final boolean f29589k;

    /* JADX INFO: renamed from: d1.x.c.b$a */
    /* JADX INFO: compiled from: CallableReference.java */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: f */
        public static final a f29590f = new a();

        private Object readResolve() throws ObjectStreamException {
            return f29590f;
        }
    }

    public CallableReference() {
        this.f29585g = a.f29590f;
        this.f29586h = null;
        this.f29587i = null;
        this.f29588j = null;
        this.f29589k = false;
    }

    /* JADX INFO: renamed from: e */
    public KCallable m13080e() {
        KCallable kCallable = this.f29584f;
        if (kCallable != null) {
            return kCallable;
        }
        KCallable kCallableMo13081g = mo13081g();
        this.f29584f = kCallableMo13081g;
        return kCallableMo13081g;
    }

    /* JADX INFO: renamed from: g */
    public abstract KCallable mo13081g();

    /* JADX INFO: renamed from: i */
    public String mo12497i() {
        return this.f29587i;
    }

    /* JADX INFO: renamed from: j */
    public KDeclarationContainer mo12498j() {
        Class cls = this.f29586h;
        if (cls == null) {
            return null;
        }
        if (!this.f29589k) {
            return Reflection.m13097a(cls);
        }
        Objects.requireNonNull(Reflection.f29605a);
        return new PackageReference(cls, "");
    }

    /* JADX INFO: renamed from: k */
    public String mo12499k() {
        return this.f29588j;
    }

    public CallableReference(Object obj) {
        this.f29585g = obj;
        this.f29586h = null;
        this.f29587i = null;
        this.f29588j = null;
        this.f29589k = false;
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.f29585g = obj;
        this.f29586h = cls;
        this.f29587i = str;
        this.f29588j = str2;
        this.f29589k = z;
    }
}
