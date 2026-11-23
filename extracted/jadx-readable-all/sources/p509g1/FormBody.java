package p509g1;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p524h1.Buffer3;
import p524h1.BufferedSink;

/* JADX INFO: renamed from: g1.t, reason: use source file name */
/* JADX INFO: compiled from: FormBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FormBody extends RequestBody {

    /* JADX INFO: renamed from: b */
    public static final MediaType2 f30624b;

    /* JADX INFO: renamed from: c */
    public final List<String> f30625c;

    /* JADX INFO: renamed from: d */
    public final List<String> f30626d;

    /* JADX INFO: renamed from: g1.t$b */
    /* JADX INFO: compiled from: FormBody.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new b(null);
        f30624b = MediaType2.f30664c.m13687a("application/x-www-form-urlencoded");
    }

    public FormBody(List<String> list, List<String> list2) {
        Intrinsics2.m13090f(list, "encodedNames");
        Intrinsics2.m13090f(list2, "encodedValues");
        this.f30625c = Util9.m13384x(list);
        this.f30626d = Util9.m13384x(list2);
    }

    @Override // p509g1.RequestBody
    /* JADX INFO: renamed from: a */
    public long mo13326a() {
        return m13644e(null, true);
    }

    @Override // p509g1.RequestBody
    /* JADX INFO: renamed from: b */
    public MediaType2 mo13327b() {
        return f30624b;
    }

    @Override // p509g1.RequestBody
    /* JADX INFO: renamed from: d */
    public void mo13328d(BufferedSink bufferedSink) throws IOException {
        Intrinsics2.m13090f(bufferedSink, "sink");
        m13644e(bufferedSink, false);
    }

    /* JADX INFO: renamed from: e */
    public final long m13644e(BufferedSink bufferedSink, boolean z) throws EOFException {
        Buffer3 buffer3Mo13739b;
        if (z) {
            buffer3Mo13739b = new Buffer3();
        } else {
            if (bufferedSink == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            buffer3Mo13739b = bufferedSink.mo13739b();
        }
        int size = this.f30625c.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer3Mo13739b.m13721J0(38);
            }
            buffer3Mo13739b.m13729P0(this.f30625c.get(i));
            buffer3Mo13739b.m13721J0(61);
            buffer3Mo13739b.m13729P0(this.f30626d.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j2 = buffer3Mo13739b.f30708g;
        buffer3Mo13739b.skip(j2);
        return j2;
    }

    /* JADX INFO: renamed from: g1.t$a */
    /* JADX INFO: compiled from: FormBody.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<String> f30627a;

        /* JADX INFO: renamed from: b */
        public final List<String> f30628b;

        /* JADX INFO: renamed from: c */
        public final Charset f30629c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(Charset charset) {
            this.f30629c = charset;
            this.f30627a = new ArrayList();
            this.f30628b = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset);
        }
    }
}
