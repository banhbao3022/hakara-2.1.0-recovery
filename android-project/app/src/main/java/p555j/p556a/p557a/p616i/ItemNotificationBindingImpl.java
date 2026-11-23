package p555j.p556a.p557a.p616i;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.Html;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import java.util.Arrays;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Notification;
import mtp.media.karaoke.data.model.User;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.n1, reason: use source file name */
/* JADX INFO: compiled from: ItemNotificationBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemNotificationBindingImpl extends ItemNotificationBinding {

    /* JADX INFO: renamed from: z */
    public static final SparseIntArray f32697z;

    /* JADX INFO: renamed from: A */
    public final CardView f32698A;

    /* JADX INFO: renamed from: B */
    public long f32699B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32697z = sparseIntArray;
        sparseIntArray.put(R.id.btnMore, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemNotificationBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 6, null, f32697z);
        super(dataBindingComponent, view, 0, (ImageView) objArrM391i[5], (TextView) objArrM391i[4], (TextView) objArrM391i[3], (LinearLayout) objArrM391i[1], (AppCompatImageView) objArrM391i[2]);
        this.f32699B = -1L;
        this.f32673u.setTag(null);
        CardView cardView = (CardView) objArrM391i[0];
        this.f32698A = cardView;
        cardView.setTag(null);
        this.f32674v.setTag(null);
        this.f32675w.setTag(null);
        this.f32676x.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        int iM388d;
        String message;
        String fullName;
        String str;
        String str2;
        String string;
        int iIsRead;
        User sender;
        String createdAt;
        String avatar;
        LinearLayout linearLayout;
        int i;
        synchronized (this) {
            j2 = this.f32699B;
            this.f32699B = 0L;
        }
        Notification notification = this.f32677y;
        long j3 = j2 & 3;
        CharSequence charSequenceFromHtml = null;
        if (j3 != 0) {
            if (notification != null) {
                iIsRead = notification.isRead();
                sender = notification.getSender();
                createdAt = notification.getCreatedAt();
                message = notification.getMessage();
            } else {
                iIsRead = 0;
                message = null;
                sender = null;
                createdAt = null;
            }
            boolean z = iIsRead == 1;
            if (j3 != 0) {
                j2 |= z ? 8L : 4L;
            }
            if (sender != null) {
                avatar = sender.getAvatar();
                fullName = sender.getFullName();
            } else {
                fullName = null;
                avatar = null;
            }
            if (z) {
                linearLayout = this.f32675w;
                i = R.color.white;
            } else {
                linearLayout = this.f32675w;
                i = R.color.teal_20;
            }
            iM388d = ViewDataBinding.m388d(linearLayout, i);
            String str3 = createdAt;
            str2 = avatar;
            str = str3;
        } else {
            iM388d = 0;
            message = null;
            fullName = null;
            str = null;
            str2 = null;
        }
        if ((j2 & 3) != 0) {
            SkuDao.a.m14082d0(this.f32673u, str);
            TextViewBindingAdapter.m16406a(this.f32674v, message);
            TextView textView = this.f32674v;
            Intrinsics2.m13089e(textView, "$this$loadNotificationContent");
            if (fullName != null) {
                Intrinsics2.m13089e(textView, "$this$getString");
                try {
                    string = textView.getResources().getString(R.string.message_notification_content);
                } catch (Resources.NotFoundException unused) {
                    string = null;
                }
                if (string != null) {
                    String str4 = String.format(string, Arrays.copyOf(new Object[]{fullName, message}, 2));
                    Intrinsics2.m13088d(str4, "java.lang.String.format(format, *args)");
                    charSequenceFromHtml = Html.fromHtml(str4);
                }
            } else {
                charSequenceFromHtml = message;
            }
            textView.setText(charSequenceFromHtml);
            this.f32675w.setBackground(new ColorDrawable(iM388d));
            SkuDao.a.m14053E(this.f32676x, str2, null, null, null, true, false, true, 0, false, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32699B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32699B = 2L;
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
        this.f32677y = (Notification) obj;
        synchronized (this) {
            this.f32699B |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
