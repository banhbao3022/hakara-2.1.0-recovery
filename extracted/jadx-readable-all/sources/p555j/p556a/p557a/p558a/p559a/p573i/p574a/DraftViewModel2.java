package p555j.p556a.p557a.p558a.p559a.p573i.p574a;

import java.util.List;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.a.i.a.g, reason: use source file name */
/* JADX INFO: compiled from: DraftViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DraftViewModel2 extends BaseLoadMoreRefreshViewModel<RecordingEntity> {

    /* JADX INFO: renamed from: s */
    public final RecordingRepository f31404s;

    /* JADX INFO: renamed from: j.a.a.a.a.i.a.g$a */
    /* JADX INFO: compiled from: DraftViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.draft.DraftViewModel$loadData$1", m13069f = "DraftViewModel.kt", m13070l = {18, 18, 21}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31405j;

        /* JADX INFO: renamed from: k */
        public int f31406k;

        /* JADX INFO: renamed from: l */
        public int f31407l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31409n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Continuation continuation) {
            super(2, continuation);
            this.f31409n = i;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return DraftViewModel2.this.new a(this.f31409n, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return DraftViewModel2.this.new a(this.f31409n, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            int i;
            DraftViewModel2 draftViewModel2;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = this.f31407l;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = this.f31406k;
                        draftViewModel2 = (DraftViewModel2) this.f31405j;
                        C5729a.m12442O(obj);
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                DraftViewModel2 draftViewModel3 = DraftViewModel2.this;
                i = this.f31409n;
                RecordingRepository recordingRepository = draftViewModel3.f31404s;
                this.f31405j = draftViewModel3;
                this.f31406k = i;
                this.f31407l = 1;
                Object objMo14201m = recordingRepository.mo14201m(this);
                if (objMo14201m == intrinsics) {
                    return intrinsics;
                }
                draftViewModel2 = draftViewModel3;
                obj = objMo14201m;
                this.f31405j = null;
                this.f31407l = 2;
                if (draftViewModel2.m13986v(i, (List) obj, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
                DraftViewModel2 draftViewModel4 = DraftViewModel2.this;
                this.f31405j = null;
                this.f31407l = 3;
                if (draftViewModel4.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public DraftViewModel2(RecordingRepository recordingRepository) {
        Intrinsics2.m13089e(recordingRepository, "recordingRepository");
        this.f31404s = recordingRepository;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, null), 3, null);
    }
}
