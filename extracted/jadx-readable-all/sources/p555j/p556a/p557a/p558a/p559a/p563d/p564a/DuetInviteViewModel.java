package p555j.p556a.p557a.p558a.p559a.p563d.p564a;

import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.remote.response.GetRecordingListResponse;
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
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.d.a.c, reason: use source file name */
/* JADX INFO: compiled from: DuetInviteViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DuetInviteViewModel extends BaseLoadMoreRefreshViewModel<Recording> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Integer> f31159s;

    /* JADX INFO: renamed from: t */
    public final MutableLiveData<Integer> f31160t;

    /* JADX INFO: renamed from: u */
    public final MutableLiveData<Integer> f31161u;

    /* JADX INFO: renamed from: v */
    public boolean f31162v;

    /* JADX INFO: renamed from: w */
    public final RecordingRepository f31163w;

    /* JADX INFO: renamed from: j.a.a.a.a.d.a.c$a */
    /* JADX INFO: compiled from: DuetInviteViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.duet.invite.DuetInviteViewModel$loadData$3", m13069f = "DuetInviteViewModel.kt", m13070l = {43, 43, 45, 45, 48}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31164j;

        /* JADX INFO: renamed from: k */
        public int f31165k;

        /* JADX INFO: renamed from: l */
        public int f31166l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ HashMap f31168n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ int f31169o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HashMap map, int i, Continuation continuation) {
            super(2, continuation);
            this.f31168n = map;
            this.f31169o = i;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return DuetInviteViewModel.this.new a(this.f31168n, this.f31169o, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return DuetInviteViewModel.this.new a(this.f31168n, this.f31169o, continuation2).mo6m(Unit.f29502a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0073 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x009a A[RETURN] */
        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            int i;
            DuetInviteViewModel duetInviteViewModel;
            DuetInviteViewModel duetInviteViewModel2;
            int i2;
            ArrayList<Recording> results;
            ArrayList<Recording> results2;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i3 = this.f31166l;
            try {
                if (i3 == 0) {
                    C5729a.m12442O(obj);
                    DuetInviteViewModel duetInviteViewModel3 = DuetInviteViewModel.this;
                    if (duetInviteViewModel3.f31162v) {
                        this.f31168n.put("type", "1");
                        duetInviteViewModel2 = DuetInviteViewModel.this;
                        i2 = this.f31169o;
                        RecordingRepository recordingRepository = duetInviteViewModel2.f31163w;
                        HashMap<String, Object> map = this.f31168n;
                        this.f31164j = duetInviteViewModel2;
                        this.f31165k = i2;
                        this.f31166l = 1;
                        obj = recordingRepository.mo14192d(3, map, this);
                        if (obj == intrinsics) {
                            return intrinsics;
                        }
                        results = ((GetRecordingListResponse) obj).getResults();
                        this.f31164j = null;
                        this.f31166l = 2;
                        if (duetInviteViewModel2.m13986v(i2, results, this) == intrinsics) {
                            return intrinsics;
                        }
                    } else {
                        i = this.f31169o;
                        RecordingRepository recordingRepository2 = duetInviteViewModel3.f31163w;
                        HashMap<String, Object> map2 = this.f31168n;
                        this.f31164j = duetInviteViewModel3;
                        this.f31165k = i;
                        this.f31166l = 3;
                        Object objMo14205q = recordingRepository2.mo14205q(map2, this);
                        if (objMo14205q == intrinsics) {
                            return intrinsics;
                        }
                        duetInviteViewModel = duetInviteViewModel3;
                        obj = objMo14205q;
                        results2 = ((GetRecordingListResponse) obj).getResults();
                        this.f31164j = null;
                        this.f31166l = 4;
                        if (duetInviteViewModel.m13986v(i, results2, this) == intrinsics) {
                            return intrinsics;
                        }
                    }
                } else if (i3 == 1) {
                    i2 = this.f31165k;
                    duetInviteViewModel2 = (DuetInviteViewModel) this.f31164j;
                    C5729a.m12442O(obj);
                    results = ((GetRecordingListResponse) obj).getResults();
                    this.f31164j = null;
                    this.f31166l = 2;
                    if (duetInviteViewModel2.m13986v(i2, results, this) == intrinsics) {
                        return intrinsics;
                    }
                } else if (i3 == 2) {
                    C5729a.m12442O(obj);
                } else if (i3 == 3) {
                    i = this.f31165k;
                    duetInviteViewModel = (DuetInviteViewModel) this.f31164j;
                    C5729a.m12442O(obj);
                    results2 = ((GetRecordingListResponse) obj).getResults();
                    this.f31164j = null;
                    this.f31166l = 4;
                    if (duetInviteViewModel.m13986v(i, results2, this) == intrinsics) {
                        return intrinsics;
                    }
                } else {
                    if (i3 != 4 && i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
            } catch (Exception e) {
                DuetInviteViewModel duetInviteViewModel4 = DuetInviteViewModel.this;
                this.f31164j = null;
                this.f31166l = 5;
                if (duetInviteViewModel4.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public DuetInviteViewModel(RecordingRepository recordingRepository) {
        Intrinsics2.m13089e(recordingRepository, "recordingRepository");
        this.f31163w = recordingRepository;
        this.f31159s = new MutableLiveData<>();
        this.f31160t = new MutableLiveData<>();
        this.f31161u = new MutableLiveData<>();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        HashMap map = new HashMap();
        map.put("page", String.valueOf(i));
        map.put("type", String.valueOf(this.f31161u.m421d()));
        Integer numM421d = this.f31160t.m421d();
        if (numM421d != null && Intrinsics2.m13091g(numM421d.intValue(), 0) > 0) {
            map.put("song_id", String.valueOf(numM421d.intValue()));
        }
        Integer numM421d2 = this.f31159s.m421d();
        if (numM421d2 != null && Intrinsics2.m13091g(numM421d2.intValue(), 0) > 0) {
            map.put("user_id", String.valueOf(numM421d2.intValue()));
        }
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(map, i, null), 3, null);
    }
}
