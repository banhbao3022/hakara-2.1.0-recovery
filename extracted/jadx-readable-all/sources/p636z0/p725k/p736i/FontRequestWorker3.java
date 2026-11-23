package p636z0.p725k.p736i;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: z0.k.i.h, reason: use source file name */
/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes.dex */
public class FontRequestWorker3 implements Callable<FontRequestWorker5.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f37913a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f37914b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FontRequest f37915c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f37916d;

    public FontRequestWorker3(String str, Context context, FontRequest fontRequest, int i) {
        this.f37913a = str;
        this.f37914b = context;
        this.f37915c = fontRequest;
        this.f37916d = i;
    }

    @Override // java.util.concurrent.Callable
    public FontRequestWorker5.a call() throws Exception {
        return FontRequestWorker5.m16206a(this.f37913a, this.f37914b, this.f37915c, this.f37916d);
    }
}
