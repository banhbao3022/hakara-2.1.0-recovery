package mtp.media.karaoke.p628ui.screen.profile.edit;

import android.app.DatePickerDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.image.ImageActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p530b.p531a.EventBus3;
import p526i1.p530b.p531a.Subscribe;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel3;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p559a.p573i.p576e0.ProfileEditActivity2;
import p555j.p556a.p557a.p558a.p559a.p573i.p576e0.ProfileEditActivity3;
import p555j.p556a.p557a.p558a.p559a.p573i.p576e0.ProfileEditActivity4;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p594d.ImageEvent;
import p555j.p556a.p557a.p606h.p607a.Auth;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.ProfileEditActivityBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p644b.p645c.AlertDialog;
import p636z0.p752p.C8310a;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: ProfileEditActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileEditActivity extends BaseActivity3<ProfileEditActivityBinding, ProfileViewModel6> {

    /* JADX INFO: renamed from: w */
    public static final C7326c f33825w = new C7326c(null);

    /* JADX INFO: renamed from: B */
    public DatePickerDialog.OnDateSetListener f33827B;

    /* JADX INFO: renamed from: C */
    public String f33828C;

    /* JADX INFO: renamed from: D */
    public String f33829D;

    /* JADX INFO: renamed from: E */
    public int f33830E;

    /* JADX INFO: renamed from: F */
    public HashMap f33831F;

    /* JADX INFO: renamed from: z */
    public Calendar f33834z;

    /* JADX INFO: renamed from: x */
    public final int f33832x = R.layout.profile_edit_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33833y = LazyJVM.m13020a(Lazy4.NONE, new C7325b(this, null, null));

    /* JADX INFO: renamed from: A */
    public final String f33826A = "dd MMMM, yyyy";

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.edit.ProfileEditActivity$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class C7324a extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f33835g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f33836h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7324a(int i, Object obj) {
            super(0);
            this.f33835g = i;
            this.f33836h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            String birthday;
            int i = this.f33835g;
            if (i == 0) {
                ProfileEditActivity.m14423W((ProfileEditActivity) this.f33836h);
                return Unit.f29502a;
            }
            if (i == 1) {
                ProfileEditActivity.m14423W((ProfileEditActivity) this.f33836h);
                return Unit.f29502a;
            }
            if (i != 2) {
                if (i != 3) {
                    throw null;
                }
                ProfileEditActivity.m14423W((ProfileEditActivity) this.f33836h);
                ((ProfileEditActivity) this.f33836h).m13971T(ImageActivity.C7282d.m14371a(ImageActivity.f33613y, (ProfileEditActivity) this.f33836h, false, true, 2));
                return Unit.f29502a;
            }
            ProfileEditActivity profileEditActivity = (ProfileEditActivity) this.f33836h;
            C7326c c7326c = ProfileEditActivity.f33825w;
            User userM421d = profileEditActivity.mo13969R().f31515m.m421d();
            Date dateM14093j = (userM421d == null || (birthday = userM421d.getBirthday()) == null) ? null : SkuDao.a.m14093j(birthday, "yyyy-MM-dd HH:mm:ss");
            if (dateM14093j != null) {
                Calendar calendar = profileEditActivity.f33834z;
                if (calendar == null) {
                    Intrinsics2.m13096l("cal");
                    throw null;
                }
                calendar.setTimeInMillis(dateM14093j.getTime());
            }
            DatePickerDialog.OnDateSetListener onDateSetListener = profileEditActivity.f33827B;
            if (onDateSetListener == null) {
                Intrinsics2.m13096l("dateSetListener");
                throw null;
            }
            Calendar calendar2 = profileEditActivity.f33834z;
            if (calendar2 == null) {
                Intrinsics2.m13096l("cal");
                throw null;
            }
            int i2 = calendar2.get(1);
            Calendar calendar3 = profileEditActivity.f33834z;
            if (calendar3 == null) {
                Intrinsics2.m13096l("cal");
                throw null;
            }
            int i3 = calendar3.get(2);
            Calendar calendar4 = profileEditActivity.f33834z;
            if (calendar4 == null) {
                Intrinsics2.m13096l("cal");
                throw null;
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(profileEditActivity, onDateSetListener, i2, i3, calendar4.get(5));
            DatePicker datePicker = datePickerDialog.getDatePicker();
            Intrinsics2.m13088d(datePicker, "datePickerDialog.datePicker");
            datePicker.setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
            ProfileEditActivity.m14423W((ProfileEditActivity) this.f33836h);
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.edit.ProfileEditActivity$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7325b extends Lambda implements InterfaceC6153a<ProfileViewModel6> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33837g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33838h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33839i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7325b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33837g = viewModelStoreOwner;
            this.f33838h = qualifier;
            this.f33839i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.z] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ProfileViewModel6 mo2c() {
            return SkuDao.a.m14107t(this.f33837g, Reflection.m13097a(ProfileViewModel6.class), this.f33838h, this.f33839i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.edit.ProfileEditActivity$c */
    /* JADX INFO: compiled from: ProfileEditActivity.kt */
    public static final class C7326c {
        public C7326c() {
        }

        public C7326c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.edit.ProfileEditActivity$d */
    /* JADX INFO: compiled from: ProfileEditActivity.kt */
    public static final class C7327d<T> implements Observer<User> {
        public C7327d() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(User user) {
            User user2 = user;
            ProfileEditActivity.this.f33829D = user2.getBirthday();
            ProfileEditActivity.this.f33830E = user2.getGender();
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.edit.ProfileEditActivity$e */
    /* JADX INFO: compiled from: ProfileEditActivity.kt */
    public static final class C7328e extends Lambda implements InterfaceC6153a<Unit> {
        public C7328e() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            ProfileEditActivity.m14423W(ProfileEditActivity.this);
            String[] strArr = {ProfileEditActivity.this.getString(R.string.text_gender_male), ProfileEditActivity.this.getString(R.string.text_gender_female), ProfileEditActivity.this.getString(R.string.text_gender_secret)};
            AlertDialog.a aVar = new AlertDialog.a(ProfileEditActivity.this);
            AlertController.C0050b c0050b = aVar.f34424a;
            c0050b.f233k = true;
            ProfileEditActivity3 profileEditActivity3 = new ProfileEditActivity3(this);
            c0050b.f235m = strArr;
            c0050b.f237o = profileEditActivity3;
            AlertDialog alertDialogCreate = aVar.create();
            Intrinsics2.m13088d(alertDialogCreate, "builder.create()");
            alertDialogCreate.show();
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.edit.ProfileEditActivity$f */
    /* JADX INFO: compiled from: ProfileEditActivity.kt */
    public static final class C7329f extends Lambda implements InterfaceC6153a<Unit> {
        public C7329f() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            ProfileEditActivity.m14423W(ProfileEditActivity.this);
            HashMap map = new HashMap();
            EditText editText = (EditText) ProfileEditActivity.this.m14424U(R.id.editFullName);
            Intrinsics2.m13088d(editText, "editFullName");
            map.put("full_name", editText.getText().toString());
            String str = ProfileEditActivity.this.f33829D;
            if (str != null) {
                map.put("birthday", str);
            }
            String str2 = ProfileEditActivity.this.f33828C;
            if (str2 != null) {
                map.put("avatar", str2);
            }
            map.put("gender", String.valueOf(ProfileEditActivity.this.f33830E));
            EditText editText2 = (EditText) ProfileEditActivity.this.m14424U(R.id.editBio);
            Intrinsics2.m13088d(editText2, "editBio");
            map.put("bio", editText2.getText().toString());
            String string = map.toString();
            Intrinsics2.m13088d(string, "hashMap.toString()");
            Intrinsics2.m13089e(string, "message");
            ProfileViewModel6 profileViewModel6Mo13969R = ProfileEditActivity.this.mo13969R();
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
            int id = user != null ? user.getId() : 0;
            Objects.requireNonNull(profileViewModel6Mo13969R);
            Intrinsics2.m13089e(map, "hashMap");
            C5729a.m12428A(C8310a.m16440e(profileViewModel6Mo13969R), null, 0, new ProfileViewModel3(profileViewModel6Mo13969R, id, map, null), 3, null);
            ProfileEditActivity.this.mo13969R().f31516n.mo422e(ProfileEditActivity.this, new ProfileEditActivity4(this));
            return Unit.f29502a;
        }
    }

    public ProfileEditActivity() {
        User userM14033a = Auth.m14033a();
        this.f33828C = userM14033a != null ? userM14033a.getAvatar() : null;
        User userM14033a2 = Auth.m14033a();
        this.f33829D = userM14033a2 != null ? userM14033a2.getBirthday() : null;
        User userM14033a3 = Auth.m14033a();
        this.f33830E = userM14033a3 != null ? userM14033a3.getGender() : 0;
    }

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ Calendar m14422V(ProfileEditActivity profileEditActivity) {
        Calendar calendar = profileEditActivity.f33834z;
        if (calendar != null) {
            return calendar;
        }
        Intrinsics2.m13096l("cal");
        throw null;
    }

    /* JADX INFO: renamed from: W */
    public static final void m14423W(ProfileEditActivity profileEditActivity) {
        LinearLayout linearLayout = (LinearLayout) profileEditActivity.m14424U(R.id.rootView);
        Intrinsics2.m13088d(linearLayout, "rootView");
        SkuDao.a.m14110w(linearLayout);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33832x;
    }

    /* JADX INFO: renamed from: U */
    public View m14424U(int i) {
        if (this.f33831F == null) {
            this.f33831F = new HashMap();
        }
        View view = (View) this.f33831F.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33831F.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public ProfileViewModel6 mo13969R() {
        return (ProfileViewModel6) this.f33833y.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        Toolbar toolbar = (Toolbar) m14424U(R.id.toolbar);
        Intrinsics2.m13088d(toolbar, "toolbar");
        SkuDao.a.m14066R(toolbar, SkuDao.a.m14105r(this));
        m14615N((Toolbar) m14424U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14593m(true);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14594n(true);
        }
        mo13969R().m13922q();
        mo13969R().f31515m.mo422e(this, new C7327d());
        Calendar calendar = Calendar.getInstance();
        Intrinsics2.m13088d(calendar, "Calendar.getInstance()");
        this.f33834z = calendar;
        this.f33827B = new ProfileEditActivity2(this);
        LinearLayout linearLayout = (LinearLayout) m14424U(R.id.rootView);
        Intrinsics2.m13088d(linearLayout, "rootView");
        SkuDao.a.m14067S(linearLayout, new C7324a(0, this));
        TextView textView = (TextView) m14424U(R.id.txtId);
        Intrinsics2.m13088d(textView, "txtId");
        SkuDao.a.m14067S(textView, new C7324a(1, this));
        TextView textView2 = (TextView) m14424U(R.id.txtBirthday);
        Intrinsics2.m13088d(textView2, "txtBirthday");
        SkuDao.a.m14067S(textView2, new C7324a(2, this));
        TextView textView3 = (TextView) m14424U(R.id.txtGender);
        Intrinsics2.m13088d(textView3, "txtGender");
        SkuDao.a.m14067S(textView3, new C7328e());
        AppCompatImageView appCompatImageView = (AppCompatImageView) m14424U(R.id.imgAvatar);
        Intrinsics2.m13088d(appCompatImageView, "imgAvatar");
        SkuDao.a.m14067S(appCompatImageView, new C7324a(3, this));
        TextView textView4 = (TextView) m14424U(R.id.btnSave);
        Intrinsics2.m13088d(textView4, "btnSave");
        SkuDao.a.m14067S(textView4, new C7329f());
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onDestroy() {
        EventBus3.m13810b().m13821m(this);
        super.onDestroy();
    }

    @Subscribe
    public final void onImageEvent(ImageEvent imageEvent) {
        Intrinsics2.m13089e(imageEvent, "event");
        if (imageEvent.f32051a.size() > 0) {
            this.f33828C = imageEvent.f32051a.get(0).getImage();
            AppCompatImageView appCompatImageView = (AppCompatImageView) m14424U(R.id.imgAvatar);
            Intrinsics2.m13088d(appCompatImageView, "imgAvatar");
            SkuDao.a.m14054F(appCompatImageView, this.f33828C, null, null, null, null, true, false, true, 0, false, null, null, null, 8030);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics2.m13089e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f143l.m133b();
        return true;
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (EventBus3.m13810b().m13814f(this)) {
            return;
        }
        EventBus3.m13810b().m13819k(this);
    }
}
