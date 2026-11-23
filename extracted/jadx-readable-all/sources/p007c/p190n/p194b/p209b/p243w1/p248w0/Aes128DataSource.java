package p007c.p190n.p194b.p209b.p243w1.p248w0;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSourceInputStream;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.e, reason: use source file name */
/* JADX INFO: compiled from: Aes128DataSource.java */
/* JADX INFO: loaded from: classes.dex */
public class Aes128DataSource implements DataSource3 {

    /* JADX INFO: renamed from: a */
    public final DataSource3 f9346a;

    /* JADX INFO: renamed from: b */
    public final byte[] f9347b;

    /* JADX INFO: renamed from: c */
    public final byte[] f9348c;

    /* JADX INFO: renamed from: d */
    public CipherInputStream f9349d;

    public Aes128DataSource(DataSource3 dataSource3, byte[] bArr, byte[] bArr2) {
        this.f9346a = dataSource3;
        this.f9347b = bArr;
        this.f9348c = bArr2;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: c */
    public final void mo2915c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f9346a.mo2915c(transferListener);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() throws IOException {
        if (this.f9349d != null) {
            this.f9349d = null;
            this.f9346a.close();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public final long mo2913h(DataSpec dataSpec) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f9347b, "AES"), new IvParameterSpec(this.f9348c));
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.f9346a, dataSpec);
                this.f9349d = new CipherInputStream(dataSourceInputStream, cipher);
                if (dataSourceInputStream.f6134i) {
                    return -1L;
                }
                dataSourceInputStream.f6131f.mo2913h(dataSourceInputStream.f6132g);
                dataSourceInputStream.f6134i = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: j */
    public final Map<String, List<String>> mo2916j() {
        return this.f9346a.mo2916j();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public final Uri mo2914n() {
        return this.f9346a.mo2914n();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(this.f9349d);
        int i3 = this.f9349d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
