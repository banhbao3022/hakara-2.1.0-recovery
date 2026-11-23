package p007c.p008a.p009a.p010a.p014h.p020i;

import android.content.Context;
import android.os.Handler;
import p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2;
import p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2;
import p007c.p190n.p194b.p209b.p234u1.MetadataOutput;
import p007c.p190n.p194b.p209b.p252x1.TextOutput;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.i.a, reason: use source file name */
/* JADX INFO: compiled from: RendererProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public class RendererProvider {

    /* JADX INFO: renamed from: a */
    public int f1560a;

    /* JADX INFO: renamed from: b */
    public int f1561b;

    /* JADX INFO: renamed from: c */
    public Context f1562c;

    /* JADX INFO: renamed from: d */
    public Handler f1563d;

    /* JADX INFO: renamed from: e */
    public TextOutput f1564e;

    /* JADX INFO: renamed from: f */
    public MetadataOutput f1565f;

    /* JADX INFO: renamed from: g */
    public AudioRendererEventListener2 f1566g;

    /* JADX INFO: renamed from: h */
    public VideoRendererEventListener2 f1567h;

    public RendererProvider(Context context, Handler handler, TextOutput textOutput, MetadataOutput metadataOutput, AudioRendererEventListener2 audioRendererEventListener2, VideoRendererEventListener2 videoRendererEventListener2) {
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(handler, "handler");
        Intrinsics2.m13089e(textOutput, "captionListener");
        Intrinsics2.m13089e(metadataOutput, "metadataListener");
        Intrinsics2.m13089e(audioRendererEventListener2, "audioRendererEventListener");
        Intrinsics2.m13089e(videoRendererEventListener2, "videoRendererEventListener");
        this.f1562c = context;
        this.f1563d = handler;
        this.f1564e = textOutput;
        this.f1565f = metadataOutput;
        this.f1566g = audioRendererEventListener2;
        this.f1567h = videoRendererEventListener2;
        this.f1560a = 50;
        this.f1561b = 5000;
    }
}
