package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.i0, reason: use source file name */
/* JADX INFO: compiled from: TsPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public interface TsPayloadReader {

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.i0$a */
    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f8202a;

        /* JADX INFO: renamed from: b */
        public final byte[] f8203b;

        public a(String str, int i, byte[] bArr) {
            this.f8202a = str;
            this.f8203b = bArr;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.i0$b */
    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f8204a;

        /* JADX INFO: renamed from: b */
        public final String f8205b;

        /* JADX INFO: renamed from: c */
        public final List<a> f8206c;

        /* JADX INFO: renamed from: d */
        public final byte[] f8207d;

        public b(int i, String str, List<a> list, byte[] bArr) {
            this.f8204a = i;
            this.f8205b = str;
            this.f8206c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f8207d = bArr;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.i0$c */
    /* JADX INFO: compiled from: TsPayloadReader.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        TsPayloadReader mo3876a(int i, b bVar);

        /* JADX INFO: renamed from: b */
        SparseArray<TsPayloadReader> mo3877b();
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.i0$d */
    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final String f8208a;

        /* JADX INFO: renamed from: b */
        public final int f8209b;

        /* JADX INFO: renamed from: c */
        public final int f8210c;

        /* JADX INFO: renamed from: d */
        public int f8211d;

        /* JADX INFO: renamed from: e */
        public String f8212e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* JADX INFO: renamed from: a */
        public void m3878a() {
            int i = this.f8211d;
            this.f8211d = i == Integer.MIN_VALUE ? this.f8209b : i + this.f8210c;
            this.f8212e = this.f8208a + this.f8211d;
        }

        /* JADX INFO: renamed from: b */
        public String m3879b() {
            if (this.f8211d != Integer.MIN_VALUE) {
                return this.f8212e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        /* JADX INFO: renamed from: c */
        public int m3880c() {
            int i = this.f8211d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f8208a = str;
            this.f8209b = i2;
            this.f8210c = i3;
            this.f8211d = Integer.MIN_VALUE;
            this.f8212e = "";
        }
    }

    /* JADX INFO: renamed from: a */
    void mo3866a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, d dVar);

    /* JADX INFO: renamed from: b */
    void mo3867b(ParsableByteArray parsableByteArray, int i) throws ParserException;

    /* JADX INFO: renamed from: c */
    void mo3868c();
}
