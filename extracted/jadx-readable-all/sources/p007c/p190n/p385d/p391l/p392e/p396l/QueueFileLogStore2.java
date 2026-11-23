package p007c.p190n.p385d.p391l.p392e.p396l;

import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p395k.CommonUtils;

/* JADX INFO: renamed from: c.n.d.l.e.l.e, reason: use source file name */
/* JADX INFO: compiled from: QueueFileLogStore.java */
/* JADX INFO: loaded from: classes.dex */
public class QueueFileLogStore2 implements FileLogStore {

    /* JADX INFO: renamed from: a */
    public static final Charset f26670a = Charset.forName(Utf8Charset.NAME);

    /* JADX INFO: renamed from: b */
    public final File f26671b;

    /* JADX INFO: renamed from: c */
    public final int f26672c;

    /* JADX INFO: renamed from: d */
    public QueueFile f26673d;

    /* JADX INFO: renamed from: c.n.d.l.e.l.e$a */
    /* JADX INFO: compiled from: QueueFileLogStore.java */
    public class a {

        /* JADX INFO: renamed from: a */
        public final byte[] f26674a;

        /* JADX INFO: renamed from: b */
        public final int f26675b;

        public a(QueueFileLogStore2 queueFileLogStore2, byte[] bArr, int i) {
            this.f26674a = bArr;
            this.f26675b = i;
        }
    }

    public QueueFileLogStore2(File file, int i) {
        this.f26671b = file;
        this.f26672c = i;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p396l.FileLogStore
    /* JADX INFO: renamed from: a */
    public void mo11812a() {
        CommonUtils.m11740c(this.f26673d, "There was a problem closing the Crashlytics log file.");
        this.f26673d = null;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p396l.FileLogStore
    /* JADX INFO: renamed from: b */
    public String mo11813b() {
        byte[] bArrMo11814c = mo11814c();
        if (bArrMo11814c != null) {
            return new String(bArrMo11814c, f26670a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // p007c.p190n.p385d.p391l.p392e.p396l.FileLogStore
    /* JADX INFO: renamed from: c */
    public byte[] mo11814c() {
        a aVar;
        if (this.f26671b.exists()) {
            m11834f();
            QueueFile queueFile = this.f26673d;
            if (queueFile == null) {
                aVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr = new byte[queueFile.m11828f0()];
                try {
                    this.f26673d.m11832u(new QueueFileLogStore(this, bArr, iArr));
                } catch (IOException e) {
                    Logger4 logger4 = Logger4.f26421a;
                    if (logger4.m11712a(6)) {
                        Log.e(logger4.f26422b, "A problem occurred while reading the Crashlytics log file.", e);
                    }
                }
                aVar = new a(this, bArr, iArr[0]);
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        int i = aVar.f26675b;
        byte[] bArr2 = new byte[i];
        System.arraycopy(aVar.f26674a, 0, bArr2, 0, i);
        return bArr2;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p396l.FileLogStore
    /* JADX INFO: renamed from: d */
    public void mo11815d() {
        CommonUtils.m11740c(this.f26673d, "There was a problem closing the Crashlytics log file.");
        this.f26673d = null;
        this.f26671b.delete();
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p396l.FileLogStore
    /* JADX INFO: renamed from: e */
    public void mo11816e(long j2, String str) {
        m11834f();
        if (this.f26673d == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i = this.f26672c / 4;
            if (str.length() > i) {
                str = "..." + str.substring(str.length() - i);
            }
            this.f26673d.m11826c(String.format(Locale.US, "%d %s%n", Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f26670a));
            while (!this.f26673d.m11821B() && this.f26673d.m11828f0() > this.f26672c) {
                this.f26673d.m11823O();
            }
        } catch (IOException e) {
            Logger4 logger4 = Logger4.f26421a;
            if (logger4.m11712a(6)) {
                Log.e(logger4.f26422b, "There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11834f() {
        if (this.f26673d == null) {
            try {
                this.f26673d = new QueueFile(this.f26671b);
            } catch (IOException e) {
                Logger4 logger4 = Logger4.f26421a;
                StringBuilder sbM1556G = outline.m1556G("Could not open log file: ");
                sbM1556G.append(this.f26671b);
                logger4.m11716e(sbM1556G.toString(), e);
            }
        }
    }
}
