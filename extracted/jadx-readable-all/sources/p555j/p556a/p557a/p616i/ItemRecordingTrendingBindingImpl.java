package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.x1, reason: use source file name */
/* JADX INFO: compiled from: ItemRecordingTrendingBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemRecordingTrendingBindingImpl extends ItemRecordingTrendingBinding {

    /* JADX INFO: renamed from: z */
    public static final SparseIntArray f32935z;

    /* JADX INFO: renamed from: A */
    public final RelativeLayout f32936A;

    /* JADX INFO: renamed from: B */
    public final AppCompatImageView f32937B;

    /* JADX INFO: renamed from: C */
    public final RelativeLayout f32938C;

    /* JADX INFO: renamed from: D */
    public final TextView f32939D;

    /* JADX INFO: renamed from: E */
    public final TextView f32940E;

    /* JADX INFO: renamed from: F */
    public final TextView f32941F;

    /* JADX INFO: renamed from: G */
    public long f32942G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32935z = sparseIntArray;
        sparseIntArray.put(R.id.actionCount, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemRecordingTrendingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 12, null, f32935z);
        super(dataBindingComponent, view, 0, (LinearLayout) objArrM391i[11], (AppCompatImageView) objArrM391i[4], (AppCompatImageView) objArrM391i[3], (TextView) objArrM391i[10], (TextView) objArrM391i[7], (TextView) objArrM391i[6]);
        this.f32942G = -1L;
        this.f32912t.setTag(null);
        this.f32913u.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArrM391i[0];
        this.f32936A = relativeLayout;
        relativeLayout.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrM391i[1];
        this.f32937B = appCompatImageView;
        appCompatImageView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArrM391i[2];
        this.f32938C = relativeLayout2;
        relativeLayout2.setTag(null);
        TextView textView = (TextView) objArrM391i[5];
        this.f32939D = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrM391i[8];
        this.f32940E = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArrM391i[9];
        this.f32941F = textView3;
        textView3.setTag(null);
        this.f32914v.setTag(null);
        this.f32915w.setTag(null);
        this.f32916x.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String str;
        String thumbnail;
        String string;
        int i;
        String str2;
        int i2;
        String name;
        String avatar;
        String str3;
        User user;
        Duet duet;
        int playCount;
        int i3;
        int format;
        int likeCount;
        String fullName;
        String avatar2;
        long j3;
        long j4;
        synchronized (this) {
            j2 = this.f32942G;
            this.f32942G = 0L;
        }
        float f = 0.0f;
        Recording recording = this.f32917y;
        long j5 = j2 & 3;
        if (j5 != 0) {
            if (recording != null) {
                user = recording.getUser();
                thumbnail = recording.getThumbnail();
                playCount = recording.getPlayCount();
                format = recording.getFormat();
                name = recording.getName();
                int type = recording.getType();
                likeCount = recording.getLikeCount();
                duet = recording.getDuet();
                i3 = type;
            } else {
                user = null;
                duet = null;
                thumbnail = null;
                playCount = 0;
                i3 = 0;
                format = 0;
                name = null;
                likeCount = 0;
            }
            if (user != null) {
                avatar2 = user.getAvatar();
                fullName = user.getFullName();
            } else {
                fullName = null;
                avatar2 = null;
            }
            string = Integer.toString(playCount);
            boolean z = format == 1;
            boolean z2 = i3 == 2;
            String string2 = Integer.toString(likeCount);
            if (j5 != 0) {
                j2 |= z ? 128L : 64L;
            }
            if ((j2 & 3) != 0) {
                if (z2) {
                    j3 = j2 | 8;
                    j4 = 32;
                } else {
                    j3 = j2 | 4;
                    j4 = 16;
                }
                j2 = j3 | j4;
            }
            User user2 = duet != null ? duet.getUser() : null;
            i2 = z ? 0 : 8;
            float dimension = z2 ? this.f32938C.getResources().getDimension(R.dimen.dp_40) : this.f32938C.getResources().getDimension(R.dimen.dp_26);
            int i4 = z2 ? 0 : 8;
            if (user2 != null) {
                avatar = user2.getAvatar();
                str3 = avatar2;
                str2 = fullName;
                f = dimension;
                str = string2;
                i = i4;
            } else {
                str2 = fullName;
                f = dimension;
                str = string2;
                i = i4;
                str3 = avatar2;
                avatar = null;
            }
        } else {
            str = null;
            thumbnail = null;
            string = null;
            i = 0;
            str2 = null;
            i2 = 0;
            name = null;
            avatar = null;
            str3 = null;
        }
        if ((j2 & 3) != 0) {
            SkuDao.a.m14053E(this.f32912t, str3, null, null, null, true, false, true, 0, false, null, null, null);
            this.f32913u.setVisibility(i);
            SkuDao.a.m14053E(this.f32913u, avatar, null, null, null, true, false, true, 0, false, null, null, null);
            SkuDao.a.m14053E(this.f32937B, thumbnail, null, null, null, true, false, false, 10, false, null, null, null);
            RelativeLayout relativeLayout = this.f32938C;
            Intrinsics2.m13089e(relativeLayout, "view");
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.width = (int) f;
            relativeLayout.setLayoutParams(layoutParams);
            TextViewBindingAdapter.m16406a(this.f32939D, str2);
            TextViewBindingAdapter.m16406a(this.f32940E, string);
            TextViewBindingAdapter.m16406a(this.f32941F, str);
            TextViewBindingAdapter.m16406a(this.f32914v, name);
            this.f32915w.setVisibility(i);
            this.f32916x.setVisibility(i2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32942G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32942G = 2L;
        }
        m401m();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: j */
    public boolean mo399j(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (8 != i) {
            return false;
        }
        this.f32917y = (Recording) obj;
        synchronized (this) {
            this.f32942G |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
