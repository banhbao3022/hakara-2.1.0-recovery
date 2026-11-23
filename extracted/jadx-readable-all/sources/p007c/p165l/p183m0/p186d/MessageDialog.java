package p007c.p165l.p183m0.p186d;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookCallback;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p178k0.AppCall;
import p007c.p165l.p178k0.CallbackManagerImpl;
import p007c.p165l.p178k0.DialogFeature;
import p007c.p165l.p178k0.DialogPresenter;
import p007c.p165l.p178k0.FacebookDialogBase;
import p007c.p165l.p178k0.FragmentWrapper;
import p007c.p165l.p183m0.Sharer;
import p007c.p165l.p183m0.p184b.MessageDialogFeature;
import p007c.p165l.p183m0.p184b.ShareContentValidation;
import p007c.p165l.p183m0.p184b.ShareInternalUtility4;
import p007c.p165l.p183m0.p185c.ShareContent;
import p007c.p165l.p183m0.p185c.ShareLinkContent;
import p007c.p165l.p183m0.p185c.ShareMessengerGenericTemplateContent;
import p007c.p165l.p183m0.p185c.ShareMessengerMediaTemplateContent;
import p007c.p165l.p183m0.p185c.ShareMessengerOpenGraphMusicTemplateContent;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p752p.p753c.Fragment;

/* JADX INFO: renamed from: c.l.m0.d.a, reason: use source file name */
/* JADX INFO: compiled from: MessageDialog.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class MessageDialog extends FacebookDialogBase<ShareContent, Sharer> {

    /* JADX INFO: renamed from: f */
    public static final int f5330f = C7804v0.m15318g(3);

    /* JADX INFO: renamed from: c.l.m0.d.a$b */
    /* JADX INFO: compiled from: MessageDialog.java */
    public class b extends FacebookDialogBase<ShareContent, Sharer>.a {
        public b(a aVar) {
            super(MessageDialog.this);
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: a */
        public boolean mo2501a(ShareContent shareContent, boolean z) {
            ShareContent shareContent2 = shareContent;
            if (shareContent2 == null) {
                return false;
            }
            DialogFeature dialogFeatureM2655g = MessageDialog.m2655g(shareContent2.getClass());
            return dialogFeatureM2655g != null && DialogPresenter.m2480a(dialogFeatureM2655g);
        }

        @Override // p007c.p165l.p178k0.FacebookDialogBase.a
        /* JADX INFO: renamed from: b */
        public AppCall mo2502b(ShareContent shareContent) {
            String str;
            ShareContent shareContent2 = shareContent;
            if (ShareContentValidation.f5215b == null) {
                ShareContentValidation.f5215b = new ShareContentValidation.c(null);
            }
            ShareContentValidation.m2622b(shareContent2, ShareContentValidation.f5215b);
            AppCall appCallMo2495a = MessageDialog.this.mo2495a();
            Objects.requireNonNull(MessageDialog.this);
            Activity activityM2496b = MessageDialog.this.m2496b();
            DialogFeature dialogFeatureM2655g = MessageDialog.m2655g(shareContent2.getClass());
            if (dialogFeatureM2655g == MessageDialogFeature.MESSAGE_DIALOG) {
                str = "status";
            } else if (dialogFeatureM2655g == MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE) {
                str = "GenericTemplate";
            } else if (dialogFeatureM2655g == MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE) {
                str = "MediaTemplate";
            } else {
                str = dialogFeatureM2655g == MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE ? "OpenGraphMusicTemplate" : "unknown";
            }
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(activityM2496b);
            Bundle bundleM1575Z = outline.m1575Z("fb_share_dialog_content_type", str);
            bundleM1575Z.putString("fb_share_dialog_content_uuid", appCallMo2495a.f4874b.toString());
            bundleM1575Z.putString("fb_share_dialog_content_page_id", shareContent2.f5258i);
            internalAppEventsLogger.m2370c("fb_messenger_share_dialog_show", bundleM1575Z);
            DialogPresenter.m2482c(appCallMo2495a, new MessageDialog2(this, appCallMo2495a, shareContent2, false), MessageDialog.m2655g(shareContent2.getClass()));
            return appCallMo2495a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageDialog(Activity activity) {
        int i = f5330f;
        super(activity, i);
        ShareInternalUtility4.m2642j(i);
    }

    /* JADX INFO: renamed from: g */
    public static DialogFeature m2655g(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSAGE_DIALOG;
        }
        if (ShareMessengerGenericTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE;
        }
        if (ShareMessengerOpenGraphMusicTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE;
        }
        if (ShareMessengerMediaTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE;
        }
        return null;
    }

    @Override // p007c.p165l.p178k0.FacebookDialogBase
    /* JADX INFO: renamed from: a */
    public AppCall mo2495a() {
        return new AppCall(this.f4952e);
    }

    @Override // p007c.p165l.p178k0.FacebookDialogBase
    /* JADX INFO: renamed from: c */
    public List<FacebookDialogBase<ShareContent, Sharer>.a> mo2497c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(null));
        return arrayList;
    }

    @Override // p007c.p165l.p178k0.FacebookDialogBase
    /* JADX INFO: renamed from: e */
    public void mo2499e(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Sharer> facebookCallback) {
        ShareInternalUtility4.m2641i(this.f4952e, callbackManagerImpl, facebookCallback);
    }

    public MessageDialog(Fragment fragment) {
        FragmentWrapper fragmentWrapper = new FragmentWrapper(fragment);
        int i = f5330f;
        super(fragmentWrapper, i);
        ShareInternalUtility4.m2642j(i);
    }

    public MessageDialog(android.app.Fragment fragment) {
        FragmentWrapper fragmentWrapper = new FragmentWrapper(fragment);
        int i = f5330f;
        super(fragmentWrapper, i);
        ShareInternalUtility4.m2642j(i);
    }
}
