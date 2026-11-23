package p509g1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import p007c.p451o.p452a.C5729a;
import p477d1.p481d0.Charsets2;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p524h1.BufferedSink;
import p524h1.JvmOkio;
import p524h1.Timeout2;

/* JADX INFO: renamed from: g1.d0, reason: use source file name */
/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class RequestBody {

    /* JADX INFO: renamed from: a */
    public static final a f29980a = new a(null);

    /* JADX INFO: renamed from: g1.d0$a */
    /* JADX INFO: compiled from: RequestBody.kt */
    public static final class a {

        /* JADX INFO: renamed from: g1.d0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RequestBody.kt */
        public static final class C8543a extends RequestBody {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ File f29981b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ MediaType2 f29982c;

            public C8543a(File file, MediaType2 mediaType2) {
                this.f29981b = file;
                this.f29982c = mediaType2;
            }

            @Override // p509g1.RequestBody
            /* JADX INFO: renamed from: a */
            public long mo13326a() {
                return this.f29981b.length();
            }

            @Override // p509g1.RequestBody
            /* JADX INFO: renamed from: b */
            public MediaType2 mo13327b() {
                return this.f29982c;
            }

            @Override // p509g1.RequestBody
            /* JADX INFO: renamed from: d */
            public void mo13328d(BufferedSink bufferedSink) throws IOException {
                Intrinsics2.m13090f(bufferedSink, "sink");
                File file = this.f29981b;
                Intrinsics2.m13090f(file, "$this$source");
                FileInputStream fileInputStream = new FileInputStream(file);
                Intrinsics2.m13090f(fileInputStream, "$this$source");
                JvmOkio jvmOkio = new JvmOkio(fileInputStream, new Timeout2());
                try {
                    bufferedSink.mo13734V(jvmOkio);
                    C5729a.m12455j(jvmOkio, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C5729a.m12455j(jvmOkio, th);
                        throw th2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g1.d0$a$b */
        /* JADX INFO: compiled from: RequestBody.kt */
        public static final class b extends RequestBody {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ byte[] f29983b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ MediaType2 f29984c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f29985d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ int f29986e;

            public b(byte[] bArr, MediaType2 mediaType2, int i, int i2) {
                this.f29983b = bArr;
                this.f29984c = mediaType2;
                this.f29985d = i;
                this.f29986e = i2;
            }

            @Override // p509g1.RequestBody
            /* JADX INFO: renamed from: a */
            public long mo13326a() {
                return this.f29985d;
            }

            @Override // p509g1.RequestBody
            /* JADX INFO: renamed from: b */
            public MediaType2 mo13327b() {
                return this.f29984c;
            }

            @Override // p509g1.RequestBody
            /* JADX INFO: renamed from: d */
            public void mo13328d(BufferedSink bufferedSink) throws IOException {
                Intrinsics2.m13090f(bufferedSink, "sink");
                bufferedSink.mo13743g(this.f29983b, this.f29986e, this.f29985d);
            }
        }

        public a() {
        }

        /* JADX INFO: renamed from: c */
        public static RequestBody m13329c(a aVar, String str, MediaType2 mediaType2, int i) {
            int i2 = i & 1;
            Objects.requireNonNull(aVar);
            Intrinsics2.m13090f(str, "$this$toRequestBody");
            byte[] bytes = str.getBytes(Charsets2.f29452a);
            Intrinsics2.m13086b(bytes, "(this as java.lang.String).getBytes(charset)");
            return aVar.m13331b(bytes, null, 0, bytes.length);
        }

        /* JADX INFO: renamed from: a */
        public final RequestBody m13330a(File file, MediaType2 mediaType2) {
            Intrinsics2.m13090f(file, "$this$asRequestBody");
            return new C8543a(file, mediaType2);
        }

        /* JADX INFO: renamed from: b */
        public final RequestBody m13331b(byte[] bArr, MediaType2 mediaType2, int i, int i2) {
            Intrinsics2.m13090f(bArr, "$this$toRequestBody");
            Util9.m13363c(bArr.length, i, i2);
            return new b(bArr, mediaType2, i2, i);
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static final RequestBody m13325c(MediaType2 mediaType2, byte[] bArr) {
        a aVar = f29980a;
        int length = bArr.length;
        Objects.requireNonNull(aVar);
        Intrinsics2.m13090f(bArr, "content");
        return aVar.m13331b(bArr, null, 0, length);
    }

    /* JADX INFO: renamed from: a */
    public long mo13326a() throws IOException {
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public abstract MediaType2 mo13327b();

    /* JADX INFO: renamed from: d */
    public abstract void mo13328d(BufferedSink bufferedSink) throws IOException;
}
