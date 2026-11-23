package p555j.p556a.p557a.p558a.p559a.p590r;

import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
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

/* JADX INFO: renamed from: j.a.a.a.a.r.m0 */
/* JADX INFO: compiled from: SingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.sing.SingViewModel$getSongDetail$1", m13069f = "SingViewModel.kt", m13070l = {66, 72}, m13071m = "invokeSuspend")
public final class C6809m0 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31903j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C6799h0 f31904k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31905l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6809m0(C6799h0 c6799h0, int i, Continuation continuation) {
        super(2, continuation);
        this.f31904k = c6799h0;
        this.f31905l = i;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new C6809m0(this.f31904k, this.f31905l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new C6809m0(this.f31904k, this.f31905l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31903j;
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
            SongRepository songRepository = this.f31904k.f31856A;
            int i2 = this.f31905l;
            this.f31903j = 1;
            obj = songRepository.mo14220b(i2, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            Song song = (Song) ((GetItemResponse) obj).getResults();
            if (song != null) {
                this.f31904k.f31857l.mo427j(song);
            }
        } catch (Exception e) {
            Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
            C6799h0 c6799h0 = this.f31904k;
            this.f31903j = 2;
            if (c6799h0.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
