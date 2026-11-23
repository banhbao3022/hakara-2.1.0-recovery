package p555j.p556a.p557a.p558a.p559a.p589q;

import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;

/* JADX INFO: renamed from: j.a.a.a.a.q.h, reason: use source file name */
/* JADX INFO: compiled from: ShareViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.share.ShareViewModel$share$1", m13069f = "ShareViewModel.kt", m13070l = {44, 46}, m13071m = "invokeSuspend")
public final class ShareViewModel2 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31807j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ShareViewModel3 f31808k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31809l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ String f31810m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f31811n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ String f31812o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareViewModel2(ShareViewModel3 shareViewModel3, int i, String str, int i2, String str2, Continuation continuation) {
        super(2, continuation);
        this.f31808k = shareViewModel3;
        this.f31809l = i;
        this.f31810m = str;
        this.f31811n = i2;
        this.f31812o = str2;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new ShareViewModel2(this.f31808k, this.f31809l, this.f31810m, this.f31811n, this.f31812o, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShareViewModel2) mo4a(coroutineScope, continuation)).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31807j;
        try {
            if (i != 0) {
                if (i == 1) {
                    C5729a.m12442O(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
                return Unit.f29502a;
            }
            C5729a.m12442O(obj);
            RecordingRepository recordingRepository = this.f31808k.f31814m;
            int i2 = this.f31809l;
            String str = this.f31810m;
            int i3 = this.f31811n;
            String str2 = this.f31812o;
            this.f31807j = 1;
            if (recordingRepository.mo14187C(i2, str, i3, str2, this) == intrinsics) {
                return intrinsics;
            }
        } catch (Exception e) {
            ShareViewModel3 shareViewModel3 = this.f31808k;
            this.f31807j = 2;
            if (shareViewModel3.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
