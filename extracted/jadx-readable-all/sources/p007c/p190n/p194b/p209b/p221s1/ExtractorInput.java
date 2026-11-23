package p007c.p190n.p194b.p209b.p221s1;

import java.io.IOException;
import p007c.p190n.p194b.p209b.p210a2.DataReader;

/* JADX INFO: renamed from: c.n.b.b.s1.i, reason: use source file name */
/* JADX INFO: compiled from: ExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public interface ExtractorInput extends DataReader {
    /* JADX INFO: renamed from: a */
    long mo3729a();

    /* JADX INFO: renamed from: b */
    boolean mo3730b(byte[] bArr, int i, int i2, boolean z) throws IOException;

    /* JADX INFO: renamed from: d */
    boolean mo3731d(byte[] bArr, int i, int i2, boolean z) throws IOException;

    /* JADX INFO: renamed from: e */
    long mo3732e();

    /* JADX INFO: renamed from: f */
    void mo3733f(int i) throws IOException;

    /* JADX INFO: renamed from: g */
    int mo3734g(int i) throws IOException;

    /* JADX INFO: renamed from: i */
    int mo3735i(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: k */
    void mo3736k();

    /* JADX INFO: renamed from: l */
    void mo3737l(int i) throws IOException;

    /* JADX INFO: renamed from: m */
    boolean mo3738m(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: o */
    void mo3739o(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: p */
    long mo3740p();

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    int read(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;
}
