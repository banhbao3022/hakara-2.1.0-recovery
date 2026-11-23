package p555j.p556a.p557a.p558a.p559a.p567e;

import java.util.HashMap;
import java.util.List;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.remote.response.GetAnyResponse;
import mtp.media.karaoke.data.remote.response.GetRecordingListResponse;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Ref3;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.MainCoroutineDispatcher;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.e.e, reason: use source file name */
/* JADX INFO: compiled from: RecordingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RecordingViewModel2 extends BaseLoadMoreRefreshViewModel<Recording> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Integer> f31252s;

    /* JADX INFO: renamed from: t */
    public final MutableLiveData<Integer> f31253t;

    /* JADX INFO: renamed from: u */
    public final MutableLiveData<Integer> f31254u;

    /* JADX INFO: renamed from: v */
    public final MutableLiveData<Double> f31255v;

    /* JADX INFO: renamed from: w */
    public final MutableLiveData<Double> f31256w;

    /* JADX INFO: renamed from: x */
    public final MutableLiveData<Boolean> f31257x;

    /* JADX INFO: renamed from: y */
    public final MutableLiveData<Integer> f31258y;

    /* JADX INFO: renamed from: z */
    public final RecordingRepository f31259z;

    /* JADX INFO: renamed from: j.a.a.a.a.e.e$a */
    /* JADX INFO: compiled from: RecordingViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.recording.RecordingViewModel$like$1", m13069f = "RecordingViewModel.kt", m13070l = {107, 111}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31260j;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ int f31262l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ String f31263m;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31264n;

        /* JADX INFO: renamed from: j.a.a.a.a.e.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RecordingViewModel.kt */
        @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.recording.RecordingViewModel$like$1$1", m13069f = "RecordingViewModel.kt", m13070l = {108}, m13071m = "invokeSuspend")
        public static final class C8549a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Object>, Object> {

            /* JADX INFO: renamed from: j */
            public int f31265j;

            public C8549a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
            /* JADX INFO: renamed from: a */
            public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
                Intrinsics2.m13089e(continuation, "completion");
                return a.this.new C8549a(continuation);
            }

            @Override // p477d1.p493x.p494b.InterfaceC6168p
            /* JADX INFO: renamed from: l */
            public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
                Continuation<? super Object> continuation2 = continuation;
                Intrinsics2.m13089e(continuation2, "completion");
                return a.this.new C8549a(continuation2).mo6m(Unit.f29502a);
            }

            @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
            /* JADX INFO: renamed from: m */
            public final Object mo6m(Object obj) throws Throwable {
                Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
                int i = this.f31265j;
                if (i == 0) {
                    C5729a.m12442O(obj);
                    a aVar = a.this;
                    RecordingRepository recordingRepository = RecordingViewModel2.this.f31259z;
                    int i2 = aVar.f31262l;
                    String str = aVar.f31263m;
                    int i3 = aVar.f31264n;
                    this.f31265j = 1;
                    obj = recordingRepository.mo14209z(i2, str, i3, this);
                    if (obj == intrinsics) {
                        return intrinsics;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
                return ((GetAnyResponse) obj).getResults();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, String str, int i2, Continuation continuation) {
            super(2, continuation);
            this.f31262l = i;
            this.f31263m = str;
            this.f31264n = i2;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return RecordingViewModel2.this.new a(this.f31262l, this.f31263m, this.f31264n, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) mo4a(coroutineScope, continuation)).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31260j;
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
                CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
                MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatchers.f29666b;
                C8549a c8549a = new C8549a(null);
                this.f31260j = 1;
                if (C5729a.m12445R(mainCoroutineDispatcher, c8549a, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                RecordingViewModel2 recordingViewModel2 = RecordingViewModel2.this;
                this.f31260j = 2;
                if (recordingViewModel2.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.e.e$b */
    /* JADX INFO: compiled from: RecordingViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.recording.RecordingViewModel$loadData$2", m13069f = "RecordingViewModel.kt", m13070l = {59, 62, 70, 78, 85, 91, 96, 99}, m13071m = "invokeSuspend")
    public static final class b extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31267j;

        /* JADX INFO: renamed from: k */
        public Object f31268k;

        /* JADX INFO: renamed from: l */
        public int f31269l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ HashMap f31271n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ int f31272o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HashMap map, int i, Continuation continuation) {
            super(2, continuation);
            this.f31271n = map;
            this.f31272o = i;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return RecordingViewModel2.this.new b(this.f31271n, this.f31272o, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return RecordingViewModel2.this.new b(this.f31271n, this.f31272o, continuation2).mo6m(Unit.f29502a);
        }

        /* JADX WARN: Code duplicated, block: B:87:0x0227 A[RETURN] */
        /* JADX WARN: Type inference failed for: r11v30, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v33, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v36, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v39, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v42, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v47, types: [T, java.util.ArrayList] */
        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Ref3 ref3;
            Ref3 ref4;
            RecordingViewModel2 recordingViewModel2;
            int i;
            List list;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            try {
                switch (this.f31269l) {
                    case 0:
                        C5729a.m12442O(obj);
                        ref3 = new Ref3();
                        ref3.f29604f = null;
                        Integer numM421d = RecordingViewModel2.this.f31254u.m421d();
                        if (numM421d != null) {
                            if (numM421d.intValue() == 4) {
                                HashMap map = this.f31271n;
                                Integer numM421d2 = RecordingViewModel2.this.f31258y.m421d();
                                map.put("type", new Integer(numM421d2 != null ? new Integer(numM421d2.intValue()).intValue() : 0));
                                RecordingRepository recordingRepository = RecordingViewModel2.this.f31259z;
                                HashMap<String, Object> map2 = this.f31271n;
                                this.f31267j = ref3;
                                this.f31268k = ref3;
                                this.f31269l = 1;
                                obj = recordingRepository.mo14193e(map2, this);
                                if (obj == intrinsics) {
                                    return intrinsics;
                                }
                                ref4 = ref3;
                                ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                                ref3 = ref4;
                            } else if (numM421d.intValue() == 5) {
                                RecordingViewModel2 recordingViewModel3 = RecordingViewModel2.this;
                                RecordingRepository recordingRepository2 = recordingViewModel3.f31259z;
                                Integer numM421d3 = recordingViewModel3.f31253t.m421d();
                                if (numM421d3 == null) {
                                    numM421d3 = new Integer(0);
                                }
                                Intrinsics2.m13088d(numM421d3, "duetId.value ?: 0");
                                int iIntValue = numM421d3.intValue();
                                HashMap<String, Object> map3 = this.f31271n;
                                this.f31267j = ref3;
                                this.f31268k = ref3;
                                this.f31269l = 2;
                                obj = recordingRepository2.mo14204p(iIntValue, map3, this);
                                if (obj == intrinsics) {
                                    return intrinsics;
                                }
                                ref4 = ref3;
                                ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                                ref3 = ref4;
                            } else if (numM421d.intValue() == 2) {
                                if ((!Intrinsics2.m13085a(RecordingViewModel2.this.f31255v.m421d(), new Double(0.0d))) && (!Intrinsics2.m13085a(RecordingViewModel2.this.f31256w.m421d(), new Double(0.0d)))) {
                                    this.f31271n.put("lat", String.valueOf(RecordingViewModel2.this.f31255v.m421d()));
                                    this.f31271n.put("long", String.valueOf(RecordingViewModel2.this.f31256w.m421d()));
                                    RecordingRepository recordingRepository3 = RecordingViewModel2.this.f31259z;
                                    Intrinsics2.m13088d(numM421d, "type");
                                    int iIntValue2 = numM421d.intValue();
                                    HashMap<String, Object> map4 = this.f31271n;
                                    this.f31267j = ref3;
                                    this.f31268k = ref3;
                                    this.f31269l = 3;
                                    obj = recordingRepository3.mo14192d(iIntValue2, map4, this);
                                    if (obj == intrinsics) {
                                        return intrinsics;
                                    }
                                    ref4 = ref3;
                                    ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                                    ref3 = ref4;
                                }
                            } else if (numM421d.intValue() == 3) {
                                this.f31271n.put("type", "10");
                                RecordingRepository recordingRepository4 = RecordingViewModel2.this.f31259z;
                                Intrinsics2.m13088d(numM421d, "type");
                                int iIntValue3 = numM421d.intValue();
                                HashMap<String, Object> map5 = this.f31271n;
                                this.f31267j = ref3;
                                this.f31268k = ref3;
                                this.f31269l = 4;
                                obj = recordingRepository4.mo14192d(iIntValue3, map5, this);
                                if (obj == intrinsics) {
                                    return intrinsics;
                                }
                                ref4 = ref3;
                                ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                                ref3 = ref4;
                            } else if (numM421d.intValue() == 6) {
                                this.f31271n.put("type", "1");
                                RecordingRepository recordingRepository5 = RecordingViewModel2.this.f31259z;
                                Intrinsics2.m13088d(numM421d, "type");
                                int iIntValue4 = numM421d.intValue();
                                HashMap<String, Object> map6 = this.f31271n;
                                this.f31267j = ref3;
                                this.f31268k = ref3;
                                this.f31269l = 5;
                                obj = recordingRepository5.mo14192d(iIntValue4, map6, this);
                                if (obj == intrinsics) {
                                    return intrinsics;
                                }
                                ref4 = ref3;
                                ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                                ref3 = ref4;
                            } else {
                                RecordingRepository recordingRepository6 = RecordingViewModel2.this.f31259z;
                                Intrinsics2.m13088d(numM421d, "type");
                                int iIntValue5 = numM421d.intValue();
                                HashMap<String, Object> map7 = this.f31271n;
                                this.f31267j = ref3;
                                this.f31268k = ref3;
                                this.f31269l = 6;
                                obj = recordingRepository6.mo14192d(iIntValue5, map7, this);
                                if (obj == intrinsics) {
                                    return intrinsics;
                                }
                                ref4 = ref3;
                                ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                                ref3 = ref4;
                            }
                        }
                        recordingViewModel2 = RecordingViewModel2.this;
                        i = this.f31272o;
                        list = (List) ref3.f29604f;
                        this.f31267j = null;
                        this.f31268k = null;
                        this.f31269l = 7;
                        if (recordingViewModel2.m13986v(i, list, this) == intrinsics) {
                            return intrinsics;
                        }
                        return Unit.f29502a;
                    case 1:
                        ref3 = (Ref3) this.f31268k;
                        ref4 = (Ref3) this.f31267j;
                        C5729a.m12442O(obj);
                        ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                        ref3 = ref4;
                        recordingViewModel2 = RecordingViewModel2.this;
                        i = this.f31272o;
                        list = (List) ref3.f29604f;
                        this.f31267j = null;
                        this.f31268k = null;
                        this.f31269l = 7;
                        if (recordingViewModel2.m13986v(i, list, this) == intrinsics) {
                            return intrinsics;
                        }
                        return Unit.f29502a;
                    case 2:
                        ref3 = (Ref3) this.f31268k;
                        ref4 = (Ref3) this.f31267j;
                        C5729a.m12442O(obj);
                        ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                        ref3 = ref4;
                        recordingViewModel2 = RecordingViewModel2.this;
                        i = this.f31272o;
                        list = (List) ref3.f29604f;
                        this.f31267j = null;
                        this.f31268k = null;
                        this.f31269l = 7;
                        if (recordingViewModel2.m13986v(i, list, this) == intrinsics) {
                            return intrinsics;
                        }
                        return Unit.f29502a;
                    case 3:
                        ref3 = (Ref3) this.f31268k;
                        ref4 = (Ref3) this.f31267j;
                        C5729a.m12442O(obj);
                        ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                        ref3 = ref4;
                        recordingViewModel2 = RecordingViewModel2.this;
                        i = this.f31272o;
                        list = (List) ref3.f29604f;
                        this.f31267j = null;
                        this.f31268k = null;
                        this.f31269l = 7;
                        if (recordingViewModel2.m13986v(i, list, this) == intrinsics) {
                            return intrinsics;
                        }
                        return Unit.f29502a;
                    case 4:
                        ref3 = (Ref3) this.f31268k;
                        ref4 = (Ref3) this.f31267j;
                        C5729a.m12442O(obj);
                        ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                        ref3 = ref4;
                        recordingViewModel2 = RecordingViewModel2.this;
                        i = this.f31272o;
                        list = (List) ref3.f29604f;
                        this.f31267j = null;
                        this.f31268k = null;
                        this.f31269l = 7;
                        if (recordingViewModel2.m13986v(i, list, this) == intrinsics) {
                            return intrinsics;
                        }
                        return Unit.f29502a;
                    case 5:
                        ref3 = (Ref3) this.f31268k;
                        ref4 = (Ref3) this.f31267j;
                        C5729a.m12442O(obj);
                        ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                        ref3 = ref4;
                        recordingViewModel2 = RecordingViewModel2.this;
                        i = this.f31272o;
                        list = (List) ref3.f29604f;
                        this.f31267j = null;
                        this.f31268k = null;
                        this.f31269l = 7;
                        if (recordingViewModel2.m13986v(i, list, this) == intrinsics) {
                            return intrinsics;
                        }
                        return Unit.f29502a;
                    case 6:
                        ref3 = (Ref3) this.f31268k;
                        ref4 = (Ref3) this.f31267j;
                        C5729a.m12442O(obj);
                        ref3.f29604f = ((GetRecordingListResponse) obj).getResults();
                        ref3 = ref4;
                        recordingViewModel2 = RecordingViewModel2.this;
                        i = this.f31272o;
                        list = (List) ref3.f29604f;
                        this.f31267j = null;
                        this.f31268k = null;
                        this.f31269l = 7;
                        if (recordingViewModel2.m13986v(i, list, this) == intrinsics) {
                            return intrinsics;
                        }
                        return Unit.f29502a;
                    case 7:
                        C5729a.m12442O(obj);
                        return Unit.f29502a;
                    case 8:
                        C5729a.m12442O(obj);
                        return Unit.f29502a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                RecordingViewModel2 recordingViewModel4 = RecordingViewModel2.this;
                this.f31267j = null;
                this.f31268k = null;
                this.f31269l = 8;
                if (recordingViewModel4.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
        }
    }

    public RecordingViewModel2(RecordingRepository recordingRepository) {
        Intrinsics2.m13089e(recordingRepository, "recordingRepository");
        this.f31259z = recordingRepository;
        this.f31252s = new MutableLiveData<>();
        this.f31253t = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j(1);
        this.f31254u = mutableLiveData;
        MutableLiveData<Double> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.mo427j(Double.valueOf(0.0d));
        this.f31255v = mutableLiveData2;
        MutableLiveData<Double> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.mo427j(Double.valueOf(0.0d));
        this.f31256w = mutableLiveData3;
        this.f31257x = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        mutableLiveData4.mo427j(1);
        this.f31258y = mutableLiveData4;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: t */
    public int mo13906t() {
        Integer numM421d = this.f31254u.m421d();
        return (numM421d != null && numM421d.intValue() == 2) ? 5 : 15;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        HashMap map = new HashMap();
        map.put("page", Integer.valueOf(i));
        Integer numM421d = this.f31252s.m421d();
        if (numM421d != null && Intrinsics2.m13091g(numM421d.intValue(), 0) > 0) {
            map.put("user_id", String.valueOf(this.f31252s.m421d()));
        }
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new b(map, i, null), 3, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m13907w(int i, String str, int i2) {
        Intrinsics2.m13089e(str, "contentType");
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, str, i2, null), 3, null);
    }
}
