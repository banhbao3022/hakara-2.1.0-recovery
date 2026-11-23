package p636z0.p752p.p753c;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: z0.p.c.w0, reason: use source file name */
/* JADX INFO: compiled from: LogWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class LogWriter extends Writer {

    /* JADX INFO: renamed from: f */
    public final String f38568f;

    /* JADX INFO: renamed from: g */
    public StringBuilder f38569g = new StringBuilder(128);

    public LogWriter(String str) {
        this.f38568f = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m16617a() {
        if (this.f38569g.length() > 0) {
            Log.d(this.f38568f, this.f38569g.toString());
            StringBuilder sb = this.f38569g;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m16617a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m16617a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                m16617a();
            } else {
                this.f38569g.append(c2);
            }
        }
    }
}
