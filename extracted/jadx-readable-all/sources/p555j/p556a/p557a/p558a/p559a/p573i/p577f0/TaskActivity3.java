package p555j.p556a.p557a.p558a.p559a.p573i.p577f0;

import android.content.SharedPreferences;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import mtp.media.karaoke.data.model.Task4;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.task.TaskActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p267a.InterfaceC2189p;
import p007c.p190n.p194b.p266d.p267a.p276f0.InterfaceC2173a;
import p007c.p190n.p385d.p386j.p389b.C5240b;
import p007c.p451o.p452a.C5729a;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel4;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p619l.DeviceUtils;
import p636z0.p752p.C8310a;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.i.f0.b, reason: use source file name */
/* JADX INFO: compiled from: TaskActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskActivity3 implements InterfaceC2189p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskActivity f31447a;

    /* JADX INFO: renamed from: j.a.a.a.a.i.f0.b$a */
    /* JADX INFO: compiled from: TaskActivity.kt */
    public static final class a<T> implements Observer<Task4> {
        public a() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Task4 task4) {
            TaskActivity3.this.f31447a.mo13969R().m13923r();
            FirebaseAnalytics firebaseAnalytics = TaskActivity3.this.f31447a.f33857G;
            if (firebaseAnalytics == null) {
                Intrinsics2.m13096l("firebaseAnalytics");
                throw null;
            }
            C5240b c5240b = new C5240b();
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
            c5240b.m11683a("user_id", String.valueOf(user != null ? Integer.valueOf(user.getId()) : null));
            SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
            if (sharedPreferences2 == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            User user2 = (User) outline.m1584f(sharedPreferences2.getString("current_user", null), User.class);
            c5240b.m11683a("full_name", String.valueOf(user2 != null ? user2.getFullName() : null));
            firebaseAnalytics.m12913a("reward_received", c5240b.f26349a);
        }
    }

    public TaskActivity3(TaskActivity taskActivity) {
        this.f31447a = taskActivity;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.InterfaceC2189p
    /* JADX INFO: renamed from: a */
    public final void mo4632a(InterfaceC2173a interfaceC2173a) {
        Intrinsics2.m13089e("User earned reward.", "message");
        ProfileViewModel6 profileViewModel6M14429W = this.f31447a.mo13969R();
        String strM14247a = DeviceUtils.f33080a.m14247a(this.f31447a);
        Objects.requireNonNull(profileViewModel6M14429W);
        Intrinsics2.m13089e(strM14247a, "uniqueId");
        C5729a.m12428A(C8310a.m16440e(profileViewModel6M14429W), null, 0, new ProfileViewModel4(profileViewModel6M14429W, 11, strM14247a, null), 3, null);
        this.f31447a.mo13969R().f31519q.mo422e(this.f31447a, new a());
    }
}
