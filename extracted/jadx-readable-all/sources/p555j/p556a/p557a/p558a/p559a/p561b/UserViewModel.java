package p555j.p556a.p557a.p558a.p559a.p561b;

import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.data.remote.response.GetListResponse;
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
import p555j.p556a.p557a.p606h.p614e.UserRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.b.g, reason: use source file name */
/* JADX INFO: compiled from: UserViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UserViewModel extends BaseLoadMoreRefreshViewModel<User> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Integer> f31082s;

    /* JADX INFO: renamed from: t */
    public final MutableLiveData<Integer> f31083t;

    /* JADX INFO: renamed from: u */
    public final UserRepository f31084u;

    /* JADX INFO: renamed from: j.a.a.a.a.b.g$a */
    /* JADX INFO: compiled from: UserViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.user.UserViewModel$loadData$1", m13069f = "UserViewModel.kt", m13070l = {27, 27, 35, 35, 43, 43, 48}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31085j;

        /* JADX INFO: renamed from: k */
        public Object f31086k;

        /* JADX INFO: renamed from: l */
        public int f31087l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31089n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ HashMap f31090o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, HashMap map, Continuation continuation) {
            super(2, continuation);
            this.f31089n = i;
            this.f31090o = map;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return UserViewModel.this.new a(this.f31089n, this.f31090o, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return UserViewModel.this.new a(this.f31089n, this.f31090o, continuation2).mo6m(Unit.f29502a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0079 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:42:0x00cd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:55:0x0120 A[RETURN] */
        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            UserViewModel userViewModel;
            int i;
            UserViewModel userViewModel2;
            int i2;
            int i3;
            UserViewModel userViewModel3;
            ArrayList results;
            ArrayList results2;
            ArrayList results3;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            try {
                switch (this.f31087l) {
                    case 0:
                        C5729a.m12442O(obj);
                        Integer numM421d = UserViewModel.this.f31082s.m421d();
                        if (numM421d != null) {
                            if (numM421d.intValue() == 1) {
                                UserViewModel userViewModel4 = UserViewModel.this;
                                i3 = this.f31089n;
                                UserRepository userRepository = userViewModel4.f31084u;
                                HashMap<String, String> map = this.f31090o;
                                this.f31086k = userViewModel4;
                                this.f31085j = i3;
                                this.f31087l = 1;
                                Object objMo14224b = userRepository.mo14224b(map, this);
                                if (objMo14224b == intrinsics) {
                                    return intrinsics;
                                }
                                userViewModel3 = userViewModel4;
                                obj = objMo14224b;
                                results = ((GetListResponse) obj).getResults();
                                this.f31086k = null;
                                this.f31087l = 2;
                                if (userViewModel3.m13986v(i3, results, this) == intrinsics) {
                                    return intrinsics;
                                }
                            } else if (numM421d.intValue() == 2) {
                                Integer numM421d2 = UserViewModel.this.f31083t.m421d();
                                if (numM421d2 != null && Intrinsics2.m13091g(numM421d2.intValue(), 0) > 0) {
                                    this.f31090o.put("follower_id", String.valueOf(numM421d2.intValue()));
                                }
                                userViewModel2 = UserViewModel.this;
                                i2 = this.f31089n;
                                UserRepository userRepository2 = userViewModel2.f31084u;
                                HashMap<String, String> map2 = this.f31090o;
                                this.f31086k = userViewModel2;
                                this.f31085j = i2;
                                this.f31087l = 3;
                                obj = userRepository2.mo14226d(map2, this);
                                if (obj == intrinsics) {
                                    return intrinsics;
                                }
                                results2 = ((GetListResponse) obj).getResults();
                                this.f31086k = null;
                                this.f31087l = 4;
                                if (userViewModel2.m13986v(i2, results2, this) == intrinsics) {
                                    return intrinsics;
                                }
                            } else if (numM421d.intValue() == 3) {
                                Integer numM421d3 = UserViewModel.this.f31083t.m421d();
                                if (numM421d3 != null && Intrinsics2.m13091g(numM421d3.intValue(), 0) > 0) {
                                    this.f31090o.put("user_id", String.valueOf(numM421d3.intValue()));
                                }
                                userViewModel = UserViewModel.this;
                                i = this.f31089n;
                                UserRepository userRepository3 = userViewModel.f31084u;
                                HashMap<String, String> map3 = this.f31090o;
                                this.f31086k = userViewModel;
                                this.f31085j = i;
                                this.f31087l = 5;
                                obj = userRepository3.mo14227e(map3, this);
                                if (obj == intrinsics) {
                                    return intrinsics;
                                }
                                results3 = ((GetListResponse) obj).getResults();
                                this.f31086k = null;
                                this.f31087l = 6;
                                if (userViewModel.m13986v(i, results3, this) == intrinsics) {
                                    return intrinsics;
                                }
                            }
                        }
                        return Unit.f29502a;
                    case 1:
                        i3 = this.f31085j;
                        userViewModel3 = (UserViewModel) this.f31086k;
                        C5729a.m12442O(obj);
                        results = ((GetListResponse) obj).getResults();
                        this.f31086k = null;
                        this.f31087l = 2;
                        if (userViewModel3.m13986v(i3, results, this) == intrinsics) {
                            return intrinsics;
                        }
                        return Unit.f29502a;
                    case 2:
                    case 4:
                    case 6:
                        C5729a.m12442O(obj);
                        return Unit.f29502a;
                    case 3:
                        i2 = this.f31085j;
                        userViewModel2 = (UserViewModel) this.f31086k;
                        C5729a.m12442O(obj);
                        results2 = ((GetListResponse) obj).getResults();
                        this.f31086k = null;
                        this.f31087l = 4;
                        if (userViewModel2.m13986v(i2, results2, this) == intrinsics) {
                            return intrinsics;
                        }
                        return Unit.f29502a;
                    case 5:
                        i = this.f31085j;
                        userViewModel = (UserViewModel) this.f31086k;
                        C5729a.m12442O(obj);
                        results3 = ((GetListResponse) obj).getResults();
                        this.f31086k = null;
                        this.f31087l = 6;
                        if (userViewModel.m13986v(i, results3, this) == intrinsics) {
                            return intrinsics;
                        }
                        return Unit.f29502a;
                    case 7:
                        C5729a.m12442O(obj);
                        return Unit.f29502a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                UserViewModel userViewModel5 = UserViewModel.this;
                this.f31086k = null;
                this.f31087l = 7;
                if (userViewModel5.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
        }
    }

    public UserViewModel(UserRepository userRepository) {
        Intrinsics2.m13089e(userRepository, "userRepository");
        this.f31084u = userRepository;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j(1);
        this.f31082s = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.mo427j(0);
        this.f31083t = mutableLiveData2;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        HashMap map = new HashMap();
        map.put("page", String.valueOf(i));
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, map, null), 3, null);
    }
}
