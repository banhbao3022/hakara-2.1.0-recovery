package p555j.p556a.p557a.p558a.p559a.p584n;

import android.content.Intent;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import java.util.Objects;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p007c.p190n.p194b.p367f.p368a.p375f.C5129c;
import p007c.p190n.p194b.p367f.p368a.p375f.ResultReceiverC5128b;
import p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5141e;
import p007c.p190n.p194b.p367f.p368a.p377h.C5142f;
import p007c.p190n.p194b.p367f.p368a.p377h.C5144h;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;
import p007c.p190n.p194b.p367f.p368a.p377h.C5155s;
import p007c.p190n.p194b.p367f.p368a.p377h.InterfaceC5137a;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.n.h, reason: use source file name */
/* JADX INFO: compiled from: PlayingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlayingActivity8<ResultT> implements InterfaceC5137a<ReviewInfo> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PlayingActivity f31682a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5129c f31683b;

    /* JADX INFO: renamed from: j.a.a.a.a.n.h$a */
    /* JADX INFO: compiled from: PlayingActivity.kt */
    public static final class a<ResultT> implements InterfaceC5137a<Void> {

        /* JADX INFO: renamed from: a */
        public static final a f31684a = new a();

        @Override // p007c.p190n.p194b.p367f.p368a.p377h.InterfaceC5137a
        /* JADX INFO: renamed from: a */
        public final void mo11562a(AbstractC5141e<Void> abstractC5141e) {
            Intrinsics2.m13089e(abstractC5141e, "it");
        }
    }

    public PlayingActivity8(PlayingActivity playingActivity, C5129c c5129c) {
        this.f31682a = playingActivity;
        this.f31683b = c5129c;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.InterfaceC5137a
    /* JADX INFO: renamed from: a */
    public final void mo11562a(AbstractC5141e<ReviewInfo> abstractC5141e) {
        Intrinsics2.m13089e(abstractC5141e, "task");
        Intrinsics2.m13089e(String.valueOf(abstractC5141e.mo11568f()), "message");
        if (abstractC5141e.mo11568f()) {
            ReviewInfo reviewInfoMo11566d = abstractC5141e.mo11566d();
            Intrinsics2.m13088d(reviewInfoMo11566d, "task.result");
            C5129c c5129c = this.f31683b;
            PlayingActivity playingActivity = this.f31682a;
            Objects.requireNonNull(c5129c);
            Intent intent = new Intent(playingActivity, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", reviewInfoMo11566d.mo11561a());
            intent.putExtra("window_flags", playingActivity.getWindow().getDecorView().getWindowSystemUiVisibility());
            C5151o c5151o = new C5151o();
            intent.putExtra("result_receiver", new ResultReceiverC5128b(c5129c.f26086b, c5151o));
            playingActivity.startActivity(intent);
            C5155s<ResultT> c5155s = c5151o.f26116a;
            Intrinsics2.m13088d(c5155s, "manager.launchReviewFlow(this, reviewInfo)");
            a aVar = a.f31684a;
            c5155s.f26119b.m11570a(new C5144h(C5142f.f26096a, aVar));
            c5155s.m11576i();
        }
    }
}
