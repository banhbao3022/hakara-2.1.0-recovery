package p007c.p190n.p430e.p432e0;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p007c.p190n.p430e.ExclusionStrategy;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p431d0.Since;
import p007c.p190n.p430e.p431d0.Until;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.o, reason: use source file name */
/* JADX INFO: compiled from: Excluder.java */
/* JADX INFO: loaded from: classes.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {

    /* JADX INFO: renamed from: f */
    public static final Excluder f27471f = new Excluder();

    /* JADX INFO: renamed from: g */
    public double f27472g = -1.0d;

    /* JADX INFO: renamed from: h */
    public int f27473h = 136;

    /* JADX INFO: renamed from: i */
    public boolean f27474i = true;

    /* JADX INFO: renamed from: j */
    public List<ExclusionStrategy> f27475j = Collections.emptyList();

    /* JADX INFO: renamed from: k */
    public List<ExclusionStrategy> f27476k = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: c.n.e.e0.o$a */
    /* JADX INFO: compiled from: Excluder.java */
    public class a<T> extends TypeAdapter2<T> {

        /* JADX INFO: renamed from: a */
        public TypeAdapter2<T> f27477a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f27478b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f27479c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Gson6 f27480d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TypeToken f27481e;

        public a(boolean z, boolean z2, Gson6 gson6, TypeToken typeToken) {
            this.f27478b = z;
            this.f27479c = z2;
            this.f27480d = gson6;
            this.f27481e = typeToken;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public T mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (this.f27478b) {
                jsonReader2.mo12235M0();
                return null;
            }
            TypeAdapter2<T> typeAdapter2M12317d = this.f27477a;
            if (typeAdapter2M12317d == null) {
                typeAdapter2M12317d = this.f27480d.m12317d(Excluder.this, this.f27481e);
                this.f27477a = typeAdapter2M12317d;
            }
            return typeAdapter2M12317d.mo12212a(jsonReader2);
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, T t) throws IOException {
            if (this.f27479c) {
                jsonWriter.mo12254O();
                return;
            }
            TypeAdapter2<T> typeAdapter2M12317d = this.f27477a;
            if (typeAdapter2M12317d == null) {
                typeAdapter2M12317d = this.f27480d.m12317d(Excluder.this, this.f27481e);
                this.f27477a = typeAdapter2M12317d;
            }
            typeAdapter2M12317d.mo12213b(jsonWriter, t);
        }
    }

    @Override // p007c.p190n.p430e.TypeAdapterFactory
    /* JADX INFO: renamed from: a */
    public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
        Class<? super T> cls = typeToken.f27513a;
        boolean zM12275b = m12275b(cls);
        boolean z = zM12275b || m12276d(cls, true);
        boolean z2 = zM12275b || m12276d(cls, false);
        if (z || z2) {
            return new a(z2, z, gson6, typeToken);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12275b(Class<?> cls) {
        if (this.f27472g == -1.0d || m12279i((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return (!this.f27474i && m12278g(cls)) || m12277e(cls);
        }
        return true;
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12276d(Class<?> cls, boolean z) {
        Iterator<ExclusionStrategy> it = (z ? this.f27475j : this.f27476k).iterator();
        while (it.hasNext()) {
            if (it.next().m12215b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12277e(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12278g(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m12279i(Since since, Until until) {
        if (since == null || since.value() <= this.f27472g) {
            return until == null || (until.value() > this.f27472g ? 1 : (until.value() == this.f27472g ? 0 : -1)) > 0;
        }
        return false;
    }
}
