package p555j.p556a.p557a.p558a.p559a.p584n;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p483s.Collections2;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;

/* JADX INFO: renamed from: j.a.a.a.a.n.k, reason: use source file name */
/* JADX INFO: compiled from: PlayingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.playing.PlayingViewModel$loadGiftRanking$1", m13069f = "PlayingViewModel.kt", m13070l = {49, 69}, m13071m = "invokeSuspend")
public final class PlayingViewModel2 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31690j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ PlayingViewModel4 f31691k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31692l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayingViewModel2(PlayingViewModel4 playingViewModel4, int i, Continuation continuation) {
        super(2, continuation);
        this.f31691k = playingViewModel4;
        this.f31692l = i;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new PlayingViewModel2(this.f31691k, this.f31692l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new PlayingViewModel2(this.f31691k, this.f31692l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Object objMo14191c;
        int i;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i2 = this.f31690j;
        int i3 = 1;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    C5729a.m12442O(obj);
                    objMo14191c = obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
                return Unit.f29502a;
            }
            C5729a.m12442O(obj);
            RecordingRepository recordingRepository = this.f31691k.f31698n;
            int i4 = this.f31692l;
            this.f31690j = 1;
            objMo14191c = recordingRepository.mo14191c(i4, this);
            if (objMo14191c == intrinsics) {
                return intrinsics;
            }
            ArrayList results = ((GetListResponse) objMo14191c).getResults();
            ArrayList<Present> arrayList = new ArrayList<>();
            if (results != null) {
                int i5 = 0;
                for (Object obj2 : results) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        Collections2.m13041f();
                        throw null;
                    }
                    Present present = (Present) obj2;
                    present.setId(new Integer(i5).intValue() + 1);
                    arrayList.add(present);
                    i5 = i6;
                }
            }
            int size = arrayList.size();
            if (size < 5 && 1 <= (i = 5 - size)) {
                while (true) {
                    arrayList.add(new Present(size + i3, 0, null, 0, 0, null, 0, 0, "", ""));
                    if (i3 == i) {
                        break;
                    }
                    i3++;
                }
            }
            this.f31691k.f31697m.mo427j(arrayList);
        } catch (Exception e) {
            PlayingViewModel4 playingViewModel4 = this.f31691k;
            this.f31690j = 2;
            if (playingViewModel4.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
