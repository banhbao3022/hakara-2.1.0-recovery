package p555j.p556a.p557a.p558a.p559a.p590r;

import androidx.lifecycle.LiveData;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p614e.SongRepository;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.r.n0 */
/* JADX INFO: compiled from: SingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.sing.SingViewModel$getSongLink$1", m13069f = "SingViewModel.kt", m13070l = {237, 239}, m13071m = "invokeSuspend")
public final class C6811n0 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f31907j;

    /* JADX INFO: renamed from: k */
    public int f31908k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C6799h0 f31909l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ String f31910m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6811n0(C6799h0 c6799h0, String str, Continuation continuation) {
        super(2, continuation);
        this.f31909l = c6799h0;
        this.f31910m = str;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new C6811n0(this.f31909l, this.f31910m, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new C6811n0(this.f31909l, this.f31910m, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        LiveData liveData;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31908k;
        try {
            if (i != 0) {
                if (i == 1) {
                    liveData = (MutableLiveData) this.f31907j;
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
            C6799h0 c6799h0 = this.f31909l;
            liveData = c6799h0.f31867v;
            SongRepository songRepository = c6799h0.f31856A;
            String str = this.f31910m;
            this.f31907j = liveData;
            this.f31908k = 1;
            obj = songRepository.mo14219a(str, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            liveData.mo427j(obj);
        } catch (Exception e) {
            C6799h0 c6799h1 = this.f31909l;
            this.f31907j = null;
            this.f31908k = 2;
            if (c6799h1.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
