package p636z0.p760t.p762b;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.t.b.b, reason: use source file name */
/* JADX INFO: compiled from: Loader.java */
/* JADX INFO: loaded from: classes.dex */
public class Loader2<D> {

    /* JADX INFO: renamed from: a */
    public int f38756a;

    /* JADX INFO: renamed from: b */
    public a<D> f38757b;

    /* JADX INFO: renamed from: c */
    public boolean f38758c = false;

    /* JADX INFO: renamed from: d */
    public boolean f38759d = false;

    /* JADX INFO: renamed from: e */
    public boolean f38760e = true;

    /* JADX INFO: renamed from: f */
    public boolean f38761f = false;

    /* JADX INFO: renamed from: z0.t.b.b$a */
    /* JADX INFO: compiled from: Loader.java */
    public interface a<D> {
    }

    public Loader2(Context context) {
        context.getApplicationContext();
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void mo16753a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f38756a);
        printWriter.print(" mListener=");
        printWriter.println(this.f38757b);
        if (this.f38758c || this.f38761f) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f38758c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f38761f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (this.f38759d || this.f38760e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f38759d);
            printWriter.print(" mReset=");
            printWriter.println(this.f38760e);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean mo16754b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void mo4921c() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C8162a.m16058c(this, sb);
        sb.append(" id=");
        return outline.m1603y(sb, this.f38756a, "}");
    }
}
