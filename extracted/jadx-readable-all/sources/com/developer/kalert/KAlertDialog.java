package com.developer.kalert;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.developer.kalert.KAlertDialog;
import com.developer.progressx.ProgressWheel;
import java.util.Objects;
import p636z0.p644b.p645c.AlertDialog;

/* JADX INFO: loaded from: classes.dex */
public class KAlertDialog extends AlertDialog implements View.OnClickListener {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CUSTOM_IMAGE_TYPE = 4;
    public static boolean DARK_STYLE = false;
    public static final int ERROR_TYPE = 1;
    public static final int INPUT_TYPE = 6;
    public static final int NORMAL_TYPE = 0;
    public static final int PROGRESS_TYPE = 5;
    public static final int SUCCESS_TYPE = 2;
    public static final int WARNING_TYPE = 3;
    private int contentTextSize;
    private int mAlertType;
    private Button mCancelButton;
    private KAlertClickListener mCancelClickListener;
    private Drawable mCancelColor;
    private String mCancelText;
    private boolean mCloseFromCancel;
    private Drawable mColor;
    private Button mConfirmButton;
    private KAlertClickListener mConfirmClickListener;
    private String mConfirmText;
    private String mContentText;
    private TextView mContentTextView;
    private ImageView mCustomImage;
    private Drawable mCustomImgDrawable;
    private View mCustomView;
    private FrameLayout mCustomViewContainer;
    private View mDialogView;
    private EditText mEditText;
    private FrameLayout mErrorFrame;
    private ImageView mErrorX;
    private final AnimationSet mErrorXInAnim;
    private final Animation mImageAnim;
    private final AnimationSet mModalInAnim;
    private final AnimationSet mModalOutAnim;
    private final Animation mOverlayOutAnim;
    private FrameLayout mProgressFrame;
    private final ProgressHelper mProgressHelper;
    private boolean mShowCancel;
    private boolean mShowConfirm;
    private boolean mShowContent;
    private boolean mShowTitleText;
    private FrameLayout mSuccessFrame;
    private ImageView mSuccessTick;
    private String mTitleText;
    private TextView mTitleTextView;
    private FrameLayout mWarningFrame;
    private int titleTextSize;

    /* JADX INFO: renamed from: com.developer.kalert.KAlertDialog$1 */
    public class AnimationAnimationListenerC57991 implements Animation.AnimationListener {
        public AnimationAnimationListenerC57991() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            KAlertDialog.this.mDialogView.setVisibility(8);
            KAlertDialog.this.mDialogView.post(new Runnable() { // from class: c.i.a.a
                @Override // java.lang.Runnable
                public final void run() {
                    KAlertDialog.AnimationAnimationListenerC57991 animationAnimationListenerC57991 = this.f4405f;
                    if (KAlertDialog.this.mCloseFromCancel) {
                        super/*android.app.Dialog*/.cancel();
                    } else {
                        super/*z0.b.c.p*/.dismiss();
                    }
                }
            });
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public interface KAlertClickListener {
        void onClick(KAlertDialog kAlertDialog);
    }

    public KAlertDialog(Context context) {
        this(context, 0);
    }

    private void changeAlertType(int i, boolean z) {
        this.mAlertType = i;
        if (this.mDialogView != null) {
            if (!z) {
                restore();
            }
            switch (this.mAlertType) {
                case 1:
                    this.mErrorFrame.setVisibility(0);
                    setConfirmButtonColor(this.mColor);
                    break;
                case 2:
                    this.mSuccessFrame.setVisibility(0);
                    setConfirmButtonColor(this.mColor);
                    break;
                case 3:
                    this.mWarningFrame.setVisibility(0);
                    setConfirmButtonColor(this.mColor);
                    break;
                case 4:
                    setCustomImage1(this.mCustomImgDrawable);
                    setConfirmButtonColor(this.mColor);
                    break;
                case 5:
                    this.mProgressFrame.setVisibility(0);
                    this.mConfirmButton.setVisibility(8);
                    setConfirmButtonColor(this.mColor);
                    break;
                case 6:
                    this.mEditText.requestFocus();
                    setConfirmButtonColor(this.mColor);
                    break;
            }
            if (z) {
                return;
            }
            playAnimation();
        }
    }

    private void playAnimation() {
        int i = this.mAlertType;
        if (i == 1) {
            this.mErrorFrame.startAnimation(this.mImageAnim);
            this.mErrorX.startAnimation(this.mErrorXInAnim);
        } else if (i == 2) {
            this.mSuccessTick.startAnimation(this.mImageAnim);
            this.mSuccessFrame.startAnimation(this.mImageAnim);
        }
    }

    private void restore() {
        this.mCustomImage.setVisibility(8);
        this.mErrorFrame.setVisibility(8);
        this.mSuccessFrame.setVisibility(8);
        this.mWarningFrame.setVisibility(8);
        this.mProgressFrame.setVisibility(8);
        this.mConfirmButton.setVisibility(0);
        this.mConfirmButton.setBackgroundResource(C5801R.drawable.button_background);
        this.mErrorFrame.clearAnimation();
        this.mErrorX.clearAnimation();
        this.mSuccessTick.clearAnimation();
    }

    private KAlertDialog setCancelButtonColor(Drawable drawable) {
        this.mCancelColor = drawable;
        Button button = this.mCancelButton;
        if (button != null && drawable != null) {
            button.setBackground(drawable);
        }
        return this;
    }

    private KAlertDialog setConfirmButtonColor(Drawable drawable) {
        this.mColor = drawable;
        Button button = this.mConfirmButton;
        if (button != null && drawable != null) {
            button.setBackground(drawable);
        }
        return this;
    }

    private KAlertDialog setCustomImage1(Drawable drawable) {
        this.mCustomImgDrawable = drawable;
        ImageView imageView = this.mCustomImage;
        if (imageView != null && drawable != null) {
            imageView.setVisibility(0);
            this.mCustomImage.setImageDrawable(this.mCustomImgDrawable);
        }
        return this;
    }

    private void showContentText() {
        this.mShowContent = true;
        TextView textView = this.mContentTextView;
        if (textView != null) {
            textView.setVisibility(0);
            this.mContentTextView.setAutoLinkMask(15);
        }
    }

    private void showTitleText() {
        this.mShowTitleText = true;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setVisibility(0);
            this.mContentTextView.setAutoLinkMask(15);
        }
    }

    public static int spToPx(float f, Context context) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        dismissWithAnimation(true);
    }

    public KAlertDialog cancelButtonColor(int i, Context context) {
        return setCancelButtonColor(getContext().getResources().getDrawable(i, context.getTheme()));
    }

    public KAlertDialog confirmButtonColor(int i, Context context) {
        return setConfirmButtonColor(getContext().getResources().getDrawable(i, context.getTheme()));
    }

    public void dismissWithAnimation() {
        dismissWithAnimation(false);
    }

    public int getAlertType() {
        return this.mAlertType;
    }

    public String getCancelText() {
        return this.mCancelText;
    }

    public String getConfirmText() {
        return this.mConfirmText;
    }

    public String getContentText() {
        return this.mContentText;
    }

    public int getContentTextSize() {
        return this.contentTextSize;
    }

    public String getInputText() {
        return this.mEditText.getText().toString();
    }

    public ProgressHelper getProgressHelper() {
        return this.mProgressHelper;
    }

    public String getTitleText() {
        return this.mTitleText;
    }

    public int getTitleTextSize() {
        return this.titleTextSize;
    }

    public boolean isShowCancelButton() {
        return this.mShowCancel;
    }

    public boolean isShowConfirmButton() {
        return this.mShowConfirm;
    }

    public boolean isShowContentText() {
        return this.mShowContent;
    }

    public boolean isShowTitleText() {
        return this.mShowTitleText;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C5801R.id.cancel_button) {
            KAlertClickListener kAlertClickListener = this.mCancelClickListener;
            if (kAlertClickListener != null) {
                kAlertClickListener.onClick(this);
                return;
            } else {
                dismissWithAnimation();
                return;
            }
        }
        if (view.getId() == C5801R.id.custom_confirm_button) {
            KAlertClickListener kAlertClickListener2 = this.mConfirmClickListener;
            if (kAlertClickListener2 != null) {
                kAlertClickListener2.onClick(this);
            } else {
                dismissWithAnimation();
            }
        }
    }

    @Override // p636z0.p644b.p645c.AlertDialog, p636z0.p644b.p645c.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5801R.layout.alert_dialog);
        Window window = getWindow();
        Objects.requireNonNull(window);
        this.mDialogView = window.getDecorView().findViewById(android.R.id.content);
        this.mTitleTextView = (TextView) findViewById(C5801R.id.title_text);
        this.mContentTextView = (TextView) findViewById(C5801R.id.content_text);
        FrameLayout frameLayout = (FrameLayout) findViewById(C5801R.id.error_frame);
        this.mErrorFrame = frameLayout;
        this.mErrorX = (ImageView) frameLayout.findViewById(C5801R.id.error_x);
        this.mEditText = (EditText) findViewById(C5801R.id.edit_text);
        this.mSuccessFrame = (FrameLayout) findViewById(C5801R.id.success_frame);
        this.mProgressFrame = (FrameLayout) findViewById(C5801R.id.progress_dialog);
        this.mSuccessTick = (ImageView) this.mSuccessFrame.findViewById(C5801R.id.success_x);
        this.mCustomImage = (ImageView) findViewById(C5801R.id.custom_image);
        this.mWarningFrame = (FrameLayout) findViewById(C5801R.id.warning_frame);
        this.mCustomViewContainer = (FrameLayout) findViewById(C5801R.id.custom_view_container);
        this.mProgressHelper.setProgressWheel((ProgressWheel) findViewById(C5801R.id.progressWheel));
        this.mConfirmButton = (Button) findViewById(C5801R.id.custom_confirm_button);
        this.mCancelButton = (Button) findViewById(C5801R.id.cancel_button);
        this.mConfirmButton.setOnClickListener(this);
        this.mCancelButton.setOnClickListener(this);
        setCustomView(this.mCustomView);
        setTitleText(this.mTitleText);
        setContentText(this.mContentText);
        setCancelText(this.mCancelText);
        setConfirmText(this.mConfirmText);
        setConfirmButtonColor(this.mColor);
        setCancelButtonColor(this.mCancelColor);
        changeAlertType(this.mAlertType, true);
    }

    @Override // android.app.Dialog
    public void onStart() {
        this.mDialogView.startAnimation(this.mModalInAnim);
        playAnimation();
    }

    public KAlertDialog setCancelClickListener(KAlertClickListener kAlertClickListener) {
        this.mCancelClickListener = kAlertClickListener;
        return this;
    }

    public KAlertDialog setCancelText(String str) {
        this.mCancelText = str;
        if (this.mCancelButton != null && str != null) {
            showCancelButton(true);
            this.mCancelButton.setText(this.mCancelText);
        }
        return this;
    }

    public KAlertDialog setConfirmClickListener(KAlertClickListener kAlertClickListener) {
        this.mConfirmClickListener = kAlertClickListener;
        return this;
    }

    public KAlertDialog setConfirmText(String str) {
        this.mConfirmText = str;
        if (this.mConfirmButton != null && str != null) {
            showConfirmButton(true);
            this.mConfirmButton.setText(this.mConfirmText);
        }
        return this;
    }

    public KAlertDialog setContentText(String str) {
        this.mContentText = str;
        if (this.mContentTextView != null && str != null) {
            showContentText();
            int i = this.contentTextSize;
            if (i != 0) {
                this.mContentTextView.setTextSize(0, spToPx(i, getContext()));
            }
            if (Build.VERSION.SDK_INT >= 24) {
                this.mContentTextView.setText(Html.fromHtml(this.mContentText, 0));
            } else {
                this.mContentTextView.setText(Html.fromHtml(this.mContentText));
            }
            this.mCustomViewContainer.setVisibility(8);
        }
        return this;
    }

    public KAlertDialog setContentTextSize(int i) {
        this.contentTextSize = i;
        return this;
    }

    public KAlertDialog setCustomImage(int i, Context context) {
        return setCustomImage1(getContext().getResources().getDrawable(i, context.getTheme()));
    }

    public KAlertDialog setCustomView(View view) {
        FrameLayout frameLayout;
        this.mCustomView = view;
        if (view != null && (frameLayout = this.mCustomViewContainer) != null) {
            frameLayout.addView(view);
            this.mCustomViewContainer.setVisibility(0);
        }
        return this;
    }

    public void setInputText(String str) {
        this.mEditText.setText(str);
    }

    public KAlertDialog setTitleText(String str) {
        this.mTitleText = str;
        if (this.mTitleTextView != null && str != null) {
            showTitleText();
            int i = this.titleTextSize;
            if (i != 0) {
                this.mTitleTextView.setTextSize(0, spToPx(i, getContext()));
            }
            if (Build.VERSION.SDK_INT >= 24) {
                this.mTitleTextView.setText(Html.fromHtml(this.mTitleText, 1));
            } else {
                this.mTitleTextView.setText(Html.fromHtml(this.mTitleText));
            }
        }
        return this;
    }

    public KAlertDialog setTitleTextSize(int i) {
        this.titleTextSize = i;
        return this;
    }

    public KAlertDialog showCancelButton(boolean z) {
        this.mShowCancel = z;
        Button button = this.mCancelButton;
        if (button != null) {
            button.setVisibility(z ? 0 : 8);
        }
        return this;
    }

    public KAlertDialog showConfirmButton(boolean z) {
        this.mShowConfirm = z;
        Button button = this.mConfirmButton;
        if (button != null) {
            button.setVisibility(z ? 0 : 8);
        }
        return this;
    }

    public KAlertDialog(Context context, int i) {
        super(context, DARK_STYLE ? C5801R.style.alert_dialog_dark : C5801R.style.alert_dialog_light);
        this.contentTextSize = 0;
        this.titleTextSize = 0;
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        this.mProgressHelper = new ProgressHelper(context);
        this.mAlertType = i;
        this.mImageAnim = AnimationLoader.loadAnimation(getContext(), C5801R.anim.error_frame_in);
        this.mErrorXInAnim = (AnimationSet) AnimationLoader.loadAnimation(getContext(), C5801R.anim.error_x_in);
        this.mModalInAnim = (AnimationSet) AnimationLoader.loadAnimation(getContext(), C5801R.anim.modal_in);
        AnimationSet animationSet = (AnimationSet) AnimationLoader.loadAnimation(getContext(), C5801R.anim.modal_out);
        this.mModalOutAnim = animationSet;
        Objects.requireNonNull(animationSet);
        animationSet.setAnimationListener(new AnimationAnimationListenerC57991());
        Animation animation = new Animation() { // from class: com.developer.kalert.KAlertDialog.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                Window window = KAlertDialog.this.getWindow();
                Objects.requireNonNull(window);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.alpha = 1.0f - f;
                KAlertDialog.this.getWindow().setAttributes(attributes);
            }
        };
        this.mOverlayOutAnim = animation;
        animation.setDuration(120L);
        Window window = getWindow();
        Objects.requireNonNull(window);
        window.setSoftInputMode(3);
    }

    public void dismissWithAnimation(boolean z) {
        this.mCloseFromCancel = z;
        this.mConfirmButton.startAnimation(this.mOverlayOutAnim);
        this.mDialogView.startAnimation(this.mModalOutAnim);
    }

    public void changeAlertType(int i) {
        changeAlertType(i, false);
    }
}
