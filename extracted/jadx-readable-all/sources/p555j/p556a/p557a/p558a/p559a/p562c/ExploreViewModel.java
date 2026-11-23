package p555j.p556a.p557a.p558a.p559a.p562c;

import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.Simple3;
import mtp.media.karaoke.data.model.User;
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
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;
import p555j.p556a.p557a.p606h.p614e.UserRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.c.h, reason: use source file name */
/* JADX INFO: compiled from: ExploreViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExploreViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: l */
    public final MutableLiveData<ArrayList<Simple3>> f31118l;

    /* JADX INFO: renamed from: m */
    public final MutableLiveData<ArrayList<User>> f31119m;

    /* JADX INFO: renamed from: n */
    public final MutableLiveData<ArrayList<Recording>> f31120n;

    /* JADX INFO: renamed from: o */
    public final MutableLiveData<ArrayList<Recording>> f31121o;

    /* JADX INFO: renamed from: p */
    public final MutableLiveData<ArrayList<Recording>> f31122p;

    /* JADX INFO: renamed from: q */
    public final MutableLiveData<ArrayList<Recording>> f31123q;

    /* JADX INFO: renamed from: r */
    public final MutableLiveData<ArrayList<Recording>> f31124r;

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<ArrayList<Recording>> f31125s;

    /* JADX INFO: renamed from: t */
    public final MutableLiveData<ArrayList<Recording>> f31126t;

    /* JADX INFO: renamed from: u */
    public final MutableLiveData<ArrayList<Recording>> f31127u;

    /* JADX INFO: renamed from: v */
    public final MutableLiveData<ArrayList<Recording>> f31128v;

    /* JADX INFO: renamed from: w */
    public final MutableLiveData<ArrayList<Recording>> f31129w;

    /* JADX INFO: renamed from: x */
    public final RecordingRepository f31130x;

    /* JADX INFO: renamed from: y */
    public final UserRepository f31131y;

    /* JADX INFO: renamed from: j.a.a.a.a.c.h$a */
    /* JADX INFO: compiled from: ExploreViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.explore.ExploreViewModel$loadExploreRecordings$1", m13069f = "ExploreViewModel.kt", m13070l = {63, 66, 69, 72, 75, 78, 82, 85, 88, 91, 96}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31132j;

        /* JADX INFO: renamed from: k */
        public int f31133k;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f31135m;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31136n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, Continuation continuation) {
            super(2, continuation);
            this.f31135m = i;
            this.f31136n = i2;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return ExploreViewModel.this.new a(this.f31135m, this.f31136n, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return ExploreViewModel.this.new a(this.f31135m, this.f31136n, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            MutableLiveData<ArrayList<Recording>> mutableLiveData;
            MutableLiveData<ArrayList<Recording>> mutableLiveData2;
            MutableLiveData<ArrayList<Recording>> mutableLiveData3;
            MutableLiveData<ArrayList<Recording>> mutableLiveData4;
            MutableLiveData<ArrayList<Recording>> mutableLiveData5;
            MutableLiveData<ArrayList<Recording>> mutableLiveData6;
            MutableLiveData<ArrayList<Recording>> mutableLiveData7;
            MutableLiveData<ArrayList<Recording>> mutableLiveData8;
            MutableLiveData<ArrayList<Recording>> mutableLiveData9;
            MutableLiveData<ArrayList<Recording>> mutableLiveData10;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            try {
                switch (this.f31133k) {
                    case 0:
                        C5729a.m12442O(obj);
                        HashMap<String, Object> map = new HashMap<>();
                        map.put("type", new Integer(this.f31135m));
                        int i = this.f31136n;
                        if (i > 0) {
                            map.put("per_page", new Integer(i));
                        }
                        int i2 = this.f31135m;
                        if (i2 == 1) {
                            ExploreViewModel exploreViewModel = ExploreViewModel.this;
                            MutableLiveData<ArrayList<Recording>> mutableLiveData11 = exploreViewModel.f31120n;
                            RecordingRepository recordingRepository = exploreViewModel.f31130x;
                            this.f31132j = mutableLiveData11;
                            this.f31133k = 1;
                            obj = recordingRepository.mo14193e(map, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            mutableLiveData10 = mutableLiveData11;
                            ArrayList<Recording> results = ((GetRecordingListResponse) obj).getResults();
                            Intrinsics2.m13087c(results);
                            mutableLiveData10.mo427j(results);
                        } else if (i2 == 2) {
                            ExploreViewModel exploreViewModel2 = ExploreViewModel.this;
                            MutableLiveData<ArrayList<Recording>> mutableLiveData12 = exploreViewModel2.f31121o;
                            RecordingRepository recordingRepository2 = exploreViewModel2.f31130x;
                            this.f31132j = mutableLiveData12;
                            this.f31133k = 2;
                            obj = recordingRepository2.mo14193e(map, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            mutableLiveData9 = mutableLiveData12;
                            ArrayList<Recording> results2 = ((GetRecordingListResponse) obj).getResults();
                            Intrinsics2.m13087c(results2);
                            mutableLiveData9.mo427j(results2);
                        } else if (i2 == 3) {
                            ExploreViewModel exploreViewModel3 = ExploreViewModel.this;
                            MutableLiveData<ArrayList<Recording>> mutableLiveData13 = exploreViewModel3.f31122p;
                            RecordingRepository recordingRepository3 = exploreViewModel3.f31130x;
                            this.f31132j = mutableLiveData13;
                            this.f31133k = 3;
                            obj = recordingRepository3.mo14193e(map, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            mutableLiveData8 = mutableLiveData13;
                            ArrayList<Recording> results3 = ((GetRecordingListResponse) obj).getResults();
                            Intrinsics2.m13087c(results3);
                            mutableLiveData8.mo427j(results3);
                        } else if (i2 == 4) {
                            ExploreViewModel exploreViewModel4 = ExploreViewModel.this;
                            MutableLiveData<ArrayList<Recording>> mutableLiveData14 = exploreViewModel4.f31123q;
                            RecordingRepository recordingRepository4 = exploreViewModel4.f31130x;
                            this.f31132j = mutableLiveData14;
                            this.f31133k = 4;
                            obj = recordingRepository4.mo14193e(map, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            mutableLiveData7 = mutableLiveData14;
                            ArrayList<Recording> results4 = ((GetRecordingListResponse) obj).getResults();
                            Intrinsics2.m13087c(results4);
                            mutableLiveData7.mo427j(results4);
                        } else if (i2 == 5) {
                            ExploreViewModel exploreViewModel5 = ExploreViewModel.this;
                            MutableLiveData<ArrayList<Recording>> mutableLiveData15 = exploreViewModel5.f31124r;
                            RecordingRepository recordingRepository5 = exploreViewModel5.f31130x;
                            this.f31132j = mutableLiveData15;
                            this.f31133k = 5;
                            obj = recordingRepository5.mo14193e(map, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            mutableLiveData6 = mutableLiveData15;
                            ArrayList<Recording> results5 = ((GetRecordingListResponse) obj).getResults();
                            Intrinsics2.m13087c(results5);
                            mutableLiveData6.mo427j(results5);
                        } else if (i2 == 6) {
                            ExploreViewModel exploreViewModel6 = ExploreViewModel.this;
                            MutableLiveData<ArrayList<Recording>> mutableLiveData16 = exploreViewModel6.f31125s;
                            RecordingRepository recordingRepository6 = exploreViewModel6.f31130x;
                            this.f31132j = mutableLiveData16;
                            this.f31133k = 6;
                            obj = recordingRepository6.mo14193e(map, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            mutableLiveData5 = mutableLiveData16;
                            ArrayList<Recording> results6 = ((GetRecordingListResponse) obj).getResults();
                            Intrinsics2.m13087c(results6);
                            mutableLiveData5.mo427j(results6);
                        } else if (i2 == 7) {
                            ExploreViewModel exploreViewModel7 = ExploreViewModel.this;
                            MutableLiveData<ArrayList<Recording>> mutableLiveData17 = exploreViewModel7.f31126t;
                            RecordingRepository recordingRepository7 = exploreViewModel7.f31130x;
                            this.f31132j = mutableLiveData17;
                            this.f31133k = 7;
                            obj = recordingRepository7.mo14193e(map, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            mutableLiveData4 = mutableLiveData17;
                            ArrayList<Recording> results7 = ((GetRecordingListResponse) obj).getResults();
                            Intrinsics2.m13087c(results7);
                            mutableLiveData4.mo427j(results7);
                        } else if (i2 == 8) {
                            ExploreViewModel exploreViewModel8 = ExploreViewModel.this;
                            MutableLiveData<ArrayList<Recording>> mutableLiveData18 = exploreViewModel8.f31127u;
                            RecordingRepository recordingRepository8 = exploreViewModel8.f31130x;
                            this.f31132j = mutableLiveData18;
                            this.f31133k = 8;
                            obj = recordingRepository8.mo14193e(map, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            mutableLiveData3 = mutableLiveData18;
                            ArrayList<Recording> results8 = ((GetRecordingListResponse) obj).getResults();
                            Intrinsics2.m13087c(results8);
                            mutableLiveData3.mo427j(results8);
                        } else if (i2 == 9) {
                            ExploreViewModel exploreViewModel9 = ExploreViewModel.this;
                            MutableLiveData<ArrayList<Recording>> mutableLiveData19 = exploreViewModel9.f31128v;
                            RecordingRepository recordingRepository9 = exploreViewModel9.f31130x;
                            this.f31132j = mutableLiveData19;
                            this.f31133k = 9;
                            obj = recordingRepository9.mo14193e(map, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            mutableLiveData2 = mutableLiveData19;
                            ArrayList<Recording> results9 = ((GetRecordingListResponse) obj).getResults();
                            Intrinsics2.m13087c(results9);
                            mutableLiveData2.mo427j(results9);
                        } else if (i2 == 10) {
                            ExploreViewModel exploreViewModel10 = ExploreViewModel.this;
                            MutableLiveData<ArrayList<Recording>> mutableLiveData20 = exploreViewModel10.f31129w;
                            RecordingRepository recordingRepository10 = exploreViewModel10.f31130x;
                            this.f31132j = mutableLiveData20;
                            this.f31133k = 10;
                            obj = recordingRepository10.mo14193e(map, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            mutableLiveData = mutableLiveData20;
                            ArrayList<Recording> results10 = ((GetRecordingListResponse) obj).getResults();
                            Intrinsics2.m13087c(results10);
                            mutableLiveData.mo427j(results10);
                        }
                        return Unit.f29502a;
                    case 1:
                        mutableLiveData10 = (MutableLiveData) this.f31132j;
                        C5729a.m12442O(obj);
                        ArrayList<Recording> results11 = ((GetRecordingListResponse) obj).getResults();
                        Intrinsics2.m13087c(results11);
                        mutableLiveData10.mo427j(results11);
                        return Unit.f29502a;
                    case 2:
                        mutableLiveData9 = (MutableLiveData) this.f31132j;
                        C5729a.m12442O(obj);
                        ArrayList<Recording> results12 = ((GetRecordingListResponse) obj).getResults();
                        Intrinsics2.m13087c(results12);
                        mutableLiveData9.mo427j(results12);
                        return Unit.f29502a;
                    case 3:
                        mutableLiveData8 = (MutableLiveData) this.f31132j;
                        C5729a.m12442O(obj);
                        ArrayList<Recording> results13 = ((GetRecordingListResponse) obj).getResults();
                        Intrinsics2.m13087c(results13);
                        mutableLiveData8.mo427j(results13);
                        return Unit.f29502a;
                    case 4:
                        mutableLiveData7 = (MutableLiveData) this.f31132j;
                        C5729a.m12442O(obj);
                        ArrayList<Recording> results14 = ((GetRecordingListResponse) obj).getResults();
                        Intrinsics2.m13087c(results14);
                        mutableLiveData7.mo427j(results14);
                        return Unit.f29502a;
                    case 5:
                        mutableLiveData6 = (MutableLiveData) this.f31132j;
                        C5729a.m12442O(obj);
                        ArrayList<Recording> results15 = ((GetRecordingListResponse) obj).getResults();
                        Intrinsics2.m13087c(results15);
                        mutableLiveData6.mo427j(results15);
                        return Unit.f29502a;
                    case 6:
                        mutableLiveData5 = (MutableLiveData) this.f31132j;
                        C5729a.m12442O(obj);
                        ArrayList<Recording> results16 = ((GetRecordingListResponse) obj).getResults();
                        Intrinsics2.m13087c(results16);
                        mutableLiveData5.mo427j(results16);
                        return Unit.f29502a;
                    case 7:
                        mutableLiveData4 = (MutableLiveData) this.f31132j;
                        C5729a.m12442O(obj);
                        ArrayList<Recording> results17 = ((GetRecordingListResponse) obj).getResults();
                        Intrinsics2.m13087c(results17);
                        mutableLiveData4.mo427j(results17);
                        return Unit.f29502a;
                    case 8:
                        mutableLiveData3 = (MutableLiveData) this.f31132j;
                        C5729a.m12442O(obj);
                        ArrayList<Recording> results18 = ((GetRecordingListResponse) obj).getResults();
                        Intrinsics2.m13087c(results18);
                        mutableLiveData3.mo427j(results18);
                        return Unit.f29502a;
                    case 9:
                        mutableLiveData2 = (MutableLiveData) this.f31132j;
                        C5729a.m12442O(obj);
                        ArrayList<Recording> results19 = ((GetRecordingListResponse) obj).getResults();
                        Intrinsics2.m13087c(results19);
                        mutableLiveData2.mo427j(results19);
                        return Unit.f29502a;
                    case 10:
                        mutableLiveData = (MutableLiveData) this.f31132j;
                        C5729a.m12442O(obj);
                        ArrayList<Recording> results110 = ((GetRecordingListResponse) obj).getResults();
                        Intrinsics2.m13087c(results110);
                        mutableLiveData.mo427j(results110);
                        return Unit.f29502a;
                    case 11:
                        C5729a.m12442O(obj);
                        return Unit.f29502a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                ExploreViewModel exploreViewModel11 = ExploreViewModel.this;
                this.f31132j = null;
                this.f31133k = 11;
                if (exploreViewModel11.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
        }
    }

    public ExploreViewModel(RecordingRepository recordingRepository, UserRepository userRepository) {
        Intrinsics2.m13089e(recordingRepository, "recordingRepository");
        Intrinsics2.m13089e(userRepository, "userRepository");
        this.f31130x = recordingRepository;
        this.f31131y = userRepository;
        this.f31118l = new MutableLiveData<>();
        new MutableLiveData();
        new MutableLiveData();
        this.f31119m = new MutableLiveData<>();
        new MutableLiveData();
        this.f31120n = new MutableLiveData<>();
        this.f31121o = new MutableLiveData<>();
        this.f31122p = new MutableLiveData<>();
        this.f31123q = new MutableLiveData<>();
        this.f31124r = new MutableLiveData<>();
        this.f31125s = new MutableLiveData<>();
        this.f31126t = new MutableLiveData<>();
        this.f31127u = new MutableLiveData<>();
        this.f31128v = new MutableLiveData<>();
        this.f31129w = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: o */
    public final void m13896o(int i, int i2) {
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, i2, null), 3, null);
    }
}
