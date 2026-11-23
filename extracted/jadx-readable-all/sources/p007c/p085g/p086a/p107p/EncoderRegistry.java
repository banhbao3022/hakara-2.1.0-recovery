package p007c.p085g.p086a.p107p;

import java.util.ArrayList;
import java.util.List;
import p007c.p085g.p086a.p089m.Encoder;

/* JADX INFO: renamed from: c.g.a.p.a, reason: use source file name */
/* JADX INFO: compiled from: EncoderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class EncoderRegistry {

    /* JADX INFO: renamed from: a */
    public final List<a<?>> f3703a = new ArrayList();

    /* JADX INFO: renamed from: c.g.a.p.a$a */
    /* JADX INFO: compiled from: EncoderRegistry.java */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f3704a;

        /* JADX INFO: renamed from: b */
        public final Encoder<T> f3705b;

        public a(Class<T> cls, Encoder<T> encoder) {
            this.f3704a = cls;
            this.f3705b = encoder;
        }
    }
}
