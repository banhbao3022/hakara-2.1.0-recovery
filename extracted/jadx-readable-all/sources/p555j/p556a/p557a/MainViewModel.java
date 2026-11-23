package p555j.p556a.p557a;

import java.util.HashMap;
import mtp.media.karaoke.data.remote.response.GetAnyResponse;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.MainCoroutineDispatcher;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p606h.p614e.UserRepository;

/* JADX INFO: renamed from: j.a.a.c, reason: use source file name */
/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.MainViewModel$initDevice$1", m13069f = "MainViewModel.kt", m13070l = {44, 48}, m13071m = "invokeSuspend")
public final class MainViewModel extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f32080j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ MainViewModel3 f32081k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ HashMap f32082l;

    /* JADX INFO: renamed from: j.a.a.c$a */
    /* JADX INFO: compiled from: MainViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.MainViewModel$initDevice$1$1", m13069f = "MainViewModel.kt", m13070l = {45}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Object>, Object> {

        /* JADX INFO: renamed from: j */
        public int f32083j;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return MainViewModel.this.new a(continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            Continuation<? super Object> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return MainViewModel.this.new a(continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f32083j;
            if (i == 0) {
                C5729a.m12442O(obj);
                MainViewModel mainViewModel = MainViewModel.this;
                UserRepository userRepository = mainViewModel.f32081k.f32091o;
                HashMap<String, String> map = mainViewModel.f32082l;
                this.f32083j = 1;
                obj = userRepository.mo14229g(map, this);
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
    public MainViewModel(MainViewModel3 mainViewModel3, HashMap map, Continuation continuation) {
        super(2, continuation);
        this.f32081k = mainViewModel3;
        this.f32082l = map;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new MainViewModel(this.f32081k, this.f32082l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new MainViewModel(this.f32081k, this.f32082l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f32080j;
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
            a aVar = new a(null);
            this.f32080j = 1;
            if (C5729a.m12445R(mainCoroutineDispatcher, aVar, this) == intrinsics) {
                return intrinsics;
            }
        } catch (Exception e) {
            MainViewModel3 mainViewModel3 = this.f32081k;
            this.f32080j = 2;
            if (mainViewModel3.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
