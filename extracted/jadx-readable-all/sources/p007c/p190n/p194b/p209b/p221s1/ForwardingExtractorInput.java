package p007c.p190n.p194b.p209b.p221s1;

import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.b.s1.q, reason: use source file name */
/* JADX INFO: compiled from: ForwardingExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public class ForwardingExtractorInput implements ExtractorInput {

    /* JADX INFO: renamed from: a */
    public final ExtractorInput f8510a;

    public ForwardingExtractorInput(ExtractorInput extractorInput) {
        this.f8510a = extractorInput;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: a */
    public long mo3729a() {
        return this.f8510a.mo3729a();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: b */
    public boolean mo3730b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f8510a.mo3730b(bArr, i, i2, z);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: d */
    public boolean mo3731d(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f8510a.mo3731d(bArr, i, i2, z);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: e */
    public long mo3732e() {
        return this.f8510a.mo3732e();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: f */
    public void mo3733f(int i) throws IOException {
        this.f8510a.mo3733f(i);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: g */
    public int mo3734g(int i) throws IOException {
        return this.f8510a.mo3734g(i);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: i */
    public int mo3735i(byte[] bArr, int i, int i2) throws IOException {
        return this.f8510a.mo3735i(bArr, i, i2);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: k */
    public void mo3736k() {
        this.f8510a.mo3736k();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: l */
    public void mo3737l(int i) throws IOException {
        this.f8510a.mo3737l(i);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: m */
    public boolean mo3738m(int i, boolean z) throws IOException {
        return this.f8510a.mo3738m(i, z);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: o */
    public void mo3739o(byte[] bArr, int i, int i2) throws IOException {
        this.f8510a.mo3739o(bArr, i, i2);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: p */
    public long mo3740p() {
        return this.f8510a.mo3740p();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput, p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f8510a.read(bArr, i, i2);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f8510a.readFully(bArr, i, i2);
    }
}
