package p636z0.p725k.p736i;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: z0.k.i.f, reason: use source file name */
/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes.dex */
public class FontRequestWorker implements Callable<FontRequestWorker5.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f37908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f37909b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FontRequest f37910c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f37911d;

    public FontRequestWorker(String str, Context context, FontRequest fontRequest, int i) {
        this.f37908a = str;
        this.f37909b = context;
        this.f37910c = fontRequest;
        this.f37911d = i;
    }

    @Override // java.util.concurrent.Callable
    public FontRequestWorker5.a call() throws Exception {
        return FontRequestWorker5.m16206a(this.f37908a, this.f37909b, this.f37910c, this.f37911d);
    }
}
