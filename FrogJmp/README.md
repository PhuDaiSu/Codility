
# FrogJmp

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-green)

A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
Count the minimal number of jumps that the small frog must perform to reach its target.
Write a function:
<p style="font-family: monospace; font-size: 9pt; display: block; white-space: pre-wrap"><tt>def solution(X, Y, D)</tt></p>
that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
For example, given:
  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:
<ul style="margin: 10px;padding: 0px;"><li>after the first jump, at position 10 + 30 = 40</li>
<li>after the second jump, at position 10 + 30 + 30 = 70</li>
<li>after the third jump, at position 10 + 30 + 30 + 30 = 100</li>
</ul>

Write an <b><b>efficient</b></b> algorithm for the following assumptions:
<ul style="margin: 10px;padding: 0px;"><li>X, Y and D are integers within the range [<span class="number">1</span>..<span class="number">1,000,000,000</span>];</li>
<li>X ≤ Y.</li>
</ul>


